import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UserDAO userDao = new UserDAOImpl();   //���������   target object
		ProxyHandler handler = new ProxyHandler(userDao);    //����Ķ���  Proxy Object
		User user= new User();       //���� Parameter
		user.setName("Shao");				
		UserDAO proxy = (UserDAO)Proxy.newProxyInstance(userDao.getClass().getClassLoader(), new Class[] {UserDAO.class}, handler);
	    proxy.save(user); // �� Proxy��ִ�� Ŀ�귽��
	}

}
