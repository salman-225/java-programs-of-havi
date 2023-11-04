package exception_handling;

import java.util.Scanner;

public class TestThrow {
	public static void main(String[] args)throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the age");
		int age= scan.nextInt();
		validate(age);
		
	}
	public static void validate(int age)
	{
		
		if(age<18)
		{
			throw new ArithmeticException("not eligible");
		}
		else
		{
			System.out.println("eligible for vote");
		}
		
	}
	
	

}
