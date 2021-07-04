package shao.hashnode.dev;

public class Singleton3 implements SingletonInterface{
	
	
	
	private Singleton3() {		
	}

	public static class SingletonCreator
	{
		private static Singleton3 singletonObj=new Singleton3();
		public synchronized static Singleton3 getInstance()
		{		
				return singletonObj;
		}
	}
}
