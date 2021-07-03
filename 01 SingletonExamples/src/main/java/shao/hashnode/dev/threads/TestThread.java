package shao.hashnode.dev.threads;

import shao.hashnode.dev.Singleton1;
import shao.hashnode.dev.SingletonInterface;

public class TestThread implements Runnable {

	SingletonInterface sgt1;
	SingletonInterface sgt2;

	public void run() {
//		while(true)
//		{
			sgt1 = Singleton1.getInstance();
			sgt2 = Singleton1.getInstance();
			if(sgt1==sgt2)
			{
				System.out.println("["+Thread.currentThread().getName()+"]"+"same object");
				System.out.println("sgt1="+sgt1);
				System.out.println("sgt2="+sgt2);
			}
			else
			{
				System.out.println("["+Thread.currentThread().getName()+"]"+"different object");
				System.out.println("sgt1="+sgt1);
				System.out.println("sgt2="+sgt2);
//				break;
			}
//		}
	}

}
