package shao.hashnode.dev;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import shao.hashnode.dev.threads.TestThread;

public class TestNGMain {

  private SingletonInterface singletonObject1;
  private SingletonInterface singletonObject2;
  @Test
  public void f() {
	  if(singletonObject1==singletonObject2)
	  {
		  System.out.println("same object");
		  System.out.println("singletonObj1="+singletonObject1);
		  System.out.println("singletonObj2="+singletonObject2);
	  }
	  else
	  {
		  System.out.println("not same object");
		  System.out.println("singletonObj1="+singletonObject1);
		  System.out.println("singletonObj2="+singletonObject2);
	  }
	  
	  /*
	   * multi-thread testing case
	   */
	  TestThread tt = new TestThread();
	  Thread thread1 = new Thread( tt, "thread1");
	  Thread thread2 = new Thread( tt, "thread2");
	  thread1.start();
	  thread2.start();
	  
  }
  @BeforeMethod
  public void beforeMethod() {	  
//	  singletonObject = new Singleton1(); this doesn't work because the constructor is private	  
	  singletonObject1 = Singleton1.getInstance();
	  singletonObject2 = Singleton1.getInstance();
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
