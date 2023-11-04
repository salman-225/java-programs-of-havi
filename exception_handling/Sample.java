package exception_handling;

public class Sample {
	public static void main(String[] args) {
		Sample2 s = new Sample2();
		s.divideTwoNumber(10, 9);
		
		
		
	}

}
class Sample2{
	public  void divideTwoNumber(int a,int b)
	{
		int c=0;
		try {
	      c=a/b;
	      System.out.println(c);
		
		}
		catch (Exception e)
		{
			e.printStackTrace();
			
		}
	
		//System.exit(0);
		finally {
			
		
			System.out.println("hi");
		}
		
	}
}
