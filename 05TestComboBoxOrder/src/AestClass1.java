
public class AestClass1 implements Interface1 {
	private String value1;
	private int value2;
	public AestClass1(String value) {
		
		// TODO Auto-generated constructor stub
		value1=value;
	}
	public String getValue1() {
		return value1;
	}
	public void setValue1(String value1) {
		this.value1 = value1;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value1;
	}
}
