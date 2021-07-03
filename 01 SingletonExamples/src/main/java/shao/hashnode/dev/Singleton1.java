package shao.hashnode.dev;

final class Singleton1 implements SingletonInterface{       //'final' prevent inner class created
	private static Singleton1 singletonObj;      //'static' prevent more than one object created

	private Singleton1() {          //'private of constructor prevent subclasses inherit the constructor and prevent new the object
		 
	}
	
	public static Singleton1 getInstance()
	{
		return singletonObj;
	}
}
