import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDAO userDao = new UserDAOImpl();   //被代理对象   target object
		ProxyHandler handler = new ProxyHandler(userDao);    //代理的对象  Proxy Object
		User user= new User();       //参数 Parameter
		user.setName("Shao");				
		UserDAO proxy = (UserDAO)Proxy.newProxyInstance(userDao.getClass().getClassLoader(), new Class[] {UserDAO.class}, handler);
	    proxy.save(user); // 在 Proxy上执行 目标方法
	}

}
