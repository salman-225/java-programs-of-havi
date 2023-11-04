package AssessmentTest;

import java.util.Scanner;

public class GcdofTwoNum04 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number 1");
		int n1=scan.nextInt();
		System.out.println("Enter the number 2");
		int n2=scan.nextInt();
		int gcd=0;
		for(int a=1;a<=n1;a++)
		{
			if(n1%a==0 && n2%a==0 ) 
			{
				gcd=a;
			}
		}
		System.out.println("The gcd of "+n1+" and "+n2+" is = "+gcd);
	}
}
