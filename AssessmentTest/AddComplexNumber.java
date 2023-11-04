package AssessmentTest;

import java.util.Scanner;

public class AddComplexNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number 1");
		System.out.println("Enter the a value");
		int a= scan.nextInt();
		System.out.println("Enter the b value");
		int b= scan.nextInt();
		System.out.println("The given number1 is"+a+"+i"+b );
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Enter the number 2");
		System.out.println("Enter the c value");
		int c= scan.nextInt();
		System.out.println("Enter the d value");
		int d= scan.nextInt();
		System.out.println("The given number1 is"+c+"+i"+d );
		int e=a+c;
		int f=b+d;
		System.out.println("The sum of given number is "+e+"+i"+f);
		
		
		
	
		
		
		
		
	
	
	}

}
