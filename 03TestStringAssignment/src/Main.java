
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass1 tc1 = new TestClass1();
		String s = tc1.getInnerString();
		System.out.println("s:"+s);
		
		tc1.setInnerString("3333333333333333333");
		System.out.println("after set");
		System.out.println("s:"+s);
		
	}

}
