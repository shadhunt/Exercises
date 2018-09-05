package com.transdyn.dynac.orbbmock;

public class NotificationThread implements Runnable {
	MockController controller;
	
	public MockController getController() {
		return controller;
	}
	public void setController(MockController controller) {
		this.controller = controller;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			controller.notifyAlert();

		}
	}
}
