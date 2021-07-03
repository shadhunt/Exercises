package shao.hashnode.dev;

/**
 * This is an example of Eager Initialization Singleton
 * @author Claude Shao
 * http://shao.hashnode.dev
 */
public class Singleton2 implements SingletonInterface{
	private static Singleton2 singletonObj = new Singleton2();

	private Singleton2() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static Singleton2 getInstance()
	{
		return singletonObj;
	}
}
