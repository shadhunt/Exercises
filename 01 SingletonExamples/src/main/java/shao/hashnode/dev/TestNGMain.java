package shao.hashnode.dev;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
