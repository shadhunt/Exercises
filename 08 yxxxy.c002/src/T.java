
public class T {
	private int count = 10;
	
										/*o 指向内存里的一个对象，要执行synchronized中代码，需要先申请o的锁，如果o指向别的对象，锁就变了。
										如果其他线程申请锁，必须等待前一个线程执行完毕。   称为：互斥锁
										*/
	public void m() 
	{
		synchronized(this)   //任何县城要执行下面的代码，必须先拿到o的锁                       /*注释掉synchronized 看看区别可知道此功能
							//synchornized锁定的不是代码块，而是对象
		{
			count--;
			System.out.println(Thread.currentThread().getName()+"count = "+count);
		}
	}
}
