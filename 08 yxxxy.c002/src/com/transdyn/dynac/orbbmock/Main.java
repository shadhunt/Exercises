package com.transdyn.dynac.orbbmock;

public class Main {
	public static void main(String[] args)
	{
		MockController controller = new MockController();
		RegisterThread registerThread = new RegisterThread();
		NotificationThread notifyThread = new NotificationThread();
		registerThread.setController(controller);
		notifyThread.setController(controller);
		Thread rThread=new Thread(registerThread, "rThread");
//		rThread.setPriority(Thread.MAX_PRIORITY);
		Thread nThread1=new Thread(notifyThread, "nThread1");		
		Thread nThread2=new Thread(notifyThread, "nThread2");
		nThread2.setPriority(Thread.MAX_PRIORITY);
		nThread1.start();
		nThread2.start();
		
		rThread.start();
		
	}
}
