package exception_handling;


 class parent{
	 public void msg()throws   ArithmeticException
	 {
	 System.out.println("This parent");
	 }
 }

public class MethodOverriding_Exception extends parent {
	
	
	public void  msg() throws  ArithmeticException
	{
		System.out.println("child method");
	}

	public static void main(String[] args) {
		parent p =new MethodOverriding_Exception ();
		p.msg();
	}
}
