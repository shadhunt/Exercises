
public class Main {
	public static void main(String[] args)
	{
		String s = "video 1 = video\n";
		s+="video 2 = no video\n";
		s+="video 3 = video\n";
		s+="video 4 = no video"; 
		String[] array = s.split("\n");
		System.out.println("array length:"+array.length);
		for(int n=0;n<array.length;n++)
		{
			System.out.println("n:"+array[n]);
			String[] subArray = array[n].split("=");
			System.out.println("subArray[1]:"+subArray[1]);
			if(subArray[1].contains("no"))
			{
				System.out.println("no video on port:"+(n+1));
			}
			else
			{
				System.out.println("yes video on port:"+(n+1));
			}
//			for(int m=0;m<subArray.length;m++)
//			{
//				System.out.println("subArray[m]:"+subArray[m]);
//			}
		}
	}
}
