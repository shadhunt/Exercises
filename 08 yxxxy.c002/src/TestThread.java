
public class TestThread implements Runnable {

	private int number;
	T t = new T();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int n=0;n<10;n++)
		{	
			
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			t.m();
		}
	}
	

}
