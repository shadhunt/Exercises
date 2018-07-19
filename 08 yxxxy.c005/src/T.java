
public class T implements Runnable{

	private int count =10;
	@Override
	public synchronized void run() {   /*
	 									* synchronized保证了线程原子性，否则，有可能在count--执行后，没有输出之前，另一个线程已经开始执行
	 									* 导致线程重入问题,输出结果与预期不一致
	 									* 
	 									* 所以一段synchronized代码是原子性的，不可分
										*/
		
		// TODO Auto-generated method stub
		count --;
		System.out.println(Thread.currentThread().getName()+" count="+ count);
	}
	public static void main(String[] args)
	{
		T t = new T();
		for(int n=0;n<5;n++)
		{
			new Thread(t,"THREAD:"+n).start();
		}
	}
}
