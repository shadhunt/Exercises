import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args)
	{
		List<String> stringList= new ArrayList();
		stringList.add("aaa");
		stringList.add("bbb");
		stringList.add("ccc");
		
		Iterator<String> itr = stringList.iterator();
		while(itr.hasNext())
		{
			itr.next();
			itr.remove();
		}
		System.out.println("============================");
		while(itr.hasNext())
		{
			System.out.println("remaining:"+itr.next());
		}
		for(String s : stringList)
		{
			System.out.println("s:"+s);
		}
	}
}
