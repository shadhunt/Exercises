import java.util.concurrent.TimeUnit;

public class Account {
	private String name;
	private double balance;
	public synchronized void set(String name, double balance)
	{
		this.name=name;
		/*
		 * 注释掉两秒钟等待，则会体现出代码的问题，放大了线程执行过程中的时间差，表明两段代码之间有可能被别的代码执行
		 * 尽管加了synchronized，仍然可以被非synchornized代码更改
		 * getBalance()可以在此处执行   --脏读   读到写入过程中没有完成的数据
		 */
		try {                      
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {     //解决脏读:在读取的时候也要加synchronized
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public static void main(String[] args)
	{
		Account a = new Account();
		new Thread(()->a.set("zhangsan",100.0)).start();
		try
		{
			TimeUnit.SECONDS.sleep(1);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
