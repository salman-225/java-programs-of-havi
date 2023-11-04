package exception_handling;

import java.util.concurrent.BrokenBarrierException;

public class tryAndCatch 
{
	public static void main(String[] args) {
		
		int a=10;
		int b=0;
		int [] aa=new int[4];
	
		try {
		int m=a/b;	
		System.out.println("hh");
			aa[6]=3;
		}
	catch(ArithmeticException   e)
		{
			System.out.println(e);
			
		}
		catch(ArrayIndexOutOfBoundsException r) {
			System.out.println(r);
		}
		finally {
		
		System.out.println("this is the result");
		
		}
	}

}
