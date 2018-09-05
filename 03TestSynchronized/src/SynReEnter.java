

/*
 * 锁重入的问题
 */
public class SynReEnter {
	public synchronized void method1()
	{
		System.out.println("method.1");
		method2();
	}
	public synchronized void method2()
	{
		System.out.println("method.2");
		method3();
	}
	public synchronized void method3()
	{
		System.out.println("method.3");		
	}
	public static void main(String[] args)
	{
		final SynReEnter sd = new SynReEnter();
		Thread th1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				sd.method1();
			}
		});
		th1.start();
	}
}
