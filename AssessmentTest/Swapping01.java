package AssessmentTest;

import java.util.Scanner;

public class Swapping01 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value a");
		int a=scan.nextInt();
		System.out.println("Enter the value b");
		int b=scan.nextInt();
		System.out.println("the values before Swapping are a= "+a+"and b= "+b);
	    a=a+b;
	    b=a-b;
	    a=a-b;
	    System.out.println("the values after Swapping are a= "+a+"and b= "+b);
	}

}
