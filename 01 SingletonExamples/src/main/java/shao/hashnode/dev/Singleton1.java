package shao.hashnode.dev;

public final class Singleton1 implements SingletonInterface{       //'final' prevent inner class created
	private static Singleton1 singletonObj;      //'static' prevent more than one object created

	private Singleton1() {          //'private of constructor prevent subclasses inherit the constructor and prevent new the object
	}
	
	public synchronized static Singleton1 getInstance()
	{
		if(singletonObj==null)
		{
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			singletonObj = new Singleton1();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return singletonObj;
		}
		else
		{
			return singletonObj;
		}		
	}
}
