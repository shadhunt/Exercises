
public class Main {
	public static void main(String[] args)
	{
//		Thread thread1 = new Thread();
//		Thread thread2 = new Thread();
//		thread1.run();
//		thread2.run();
		TestThread tt = new TestThread();
		Thread thread1 = new Thread(tt,"sync thread 1");
		Thread thread2 = new Thread(tt,"sync thread 2");		
		thread1.start();
		thread2.start();
	}
}
