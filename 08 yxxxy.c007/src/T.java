
public class T{

	/**同步方法和非同步方法是否可以同时调用
	 * 
	 */
	public synchronized void m1()
	{
		System.out.println(Thread.currentThread().getName()+"m1 start...");
		try
		{
			Thread.sleep(30000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"m1 end");
	 }
	public void m2()
	{
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"m2 is called");
	}
	public static void main(String[] args)
	{
		T t = new T();

		new Thread(()->t.m1(),"thread 1").start();
		new Thread(()->t.m2(),"thread 2").start();

		
	}

}
