package exception_handling;

public class Exception_propogation {
	public static void main(String[] args) {
		Exception_propogation  obj=new  Exception_propogation();
		
		try {
		obj.m();
		}
		catch(ArithmeticException e) {
			System.out.println('h');
			
		}
		
	}
	public void m()
	{
		n();
	}
	public void n()
	{
		p();
		
	}
	public void p() {
		int data=10/0;
		System.out.println(data);
	}

}
