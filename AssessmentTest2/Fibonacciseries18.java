package AssessmentTest2;

import java.util.Scanner;

public class Fibonacciseries18 {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a+" "+b);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the end number of fibonacci series");
		int num=scan.nextInt();
		for(int i=0;i<num;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
			
		}
	 
		 
	}

}
