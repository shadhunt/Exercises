package shao.hashnode.dev;

import shao.hashnode.dev.threads.TestThread;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  TestThread tt = new TestThread();
		  Thread thread1 = new Thread( tt, "thread1");
		  Thread thread2 = new Thread( tt, "thread2");
		  thread1.start();
		  thread2.start();
	}

}
