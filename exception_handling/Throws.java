package exception_handling;

public class Throws {
	public static void main(String[] args) {
		try {
			int a =throwsTest.divideTwoNumbers(10,0);
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("end of javacode");
		
	}

}
class throwsTest {
	public  static int divideTwoNumbers(int a,int b)throws RuntimeException {
		
		//String s=null;
	//System.out.println(s.length());
		return a/b;
	}
}
