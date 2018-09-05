package com.transdyn.dynac.orbbmock;

public class MockController {
	private int count=5;
	public void register()
	{

		try {
			for(int n=0;n<10;n++)
			{
				System.out.println("Register waiting for:"+n+" sec");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("regsiter:::::::::"+Thread.currentThread().getName());

	}
	public void notifyAlert()
	{
		synchronized(this)
		{
			System.out.println("notifyAlert:::::::::::"+Thread.currentThread().getName());
			try {
				for(int n=0;n<10;n++)
				{
					System.out.println("notifyAlert waiting for:"+n+" sec");
					Thread.sleep(1000);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("count="+count);
			count--;                                     //find a reason to break the thread
			if(count<=0)
			{
				count=5;
			}
		}
	}
}
