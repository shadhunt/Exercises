import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
	private Object target;
	
	public ProxyHandler(Object target) {
		this.target=target;
		// TODO Auto-generated constructor stub
	}
	public void beforeMethod()
	{
		System.out.println("Before Method");
	}
	public void afterMethod()
	{
		System.out.println("after method");
		
	}
	@Override
	
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub\
		beforeMethod();
		method.invoke(target,args);
//		afterMethod();
		return null;
	}

}
