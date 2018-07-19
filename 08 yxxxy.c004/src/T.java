
public class T {
	private static int count = 10;  /*注意 static*/
	
										/*o 指向内存里的一个对象，要执行synchronized中代码，需要先申请o的锁，如果o指向别的对象，锁就变了。
										如果其他线程申请锁，必须等待前一个线程执行完毕。   称为：互斥锁
										*/
	public synchronized void m() 
	{
		   //任何县城要执行下面的代码，必须先拿到o的锁                       /*注释掉synchronized 看看区别可知道此功能
							//synchornized锁定的不是代码块，而是当前对象
							//等同于在方法的代码执行时要synchronized(this)
		{
			count--;
			System.out.println(Thread.currentThread().getName()+"count = "+count);
		}
	}
	
	public static void mm() {
		synchronized(T.class)   //考虑一下这里写synchronized(this)是否可以?
								//因为静态对象是不需要new来建立的，因为没有new所以就没有this的存在
								//所以锁定静态方法的时候，相当于锁定当前类的.class对象 (反射)
		{
			count --;
		}
	}
}
