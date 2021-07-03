package shao.hashnode.dev;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGMain {
  private SingletonInterface singletonInterface;
  private SingletonInterface singletonObject1;
  private SingletonInterface singletonObject2;
  @Test
  public void f() {
	  if(singletonObject1==singletonObject2)
	  {
		  System.out.println("same object");
	  }
	  else
	  {
		  System.out.println("not same object");
	  }
  }
  @BeforeMethod
  public void beforeMethod() {	  
//	  singletonObject = new Singleton1(); this doesn't work because the constructor is private
	  singletonObject1 = ((Singleton1)singletonInterface).getInstance();
	  singletonObject2 = ((Singleton1)singletonInterface).getInstance();
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
