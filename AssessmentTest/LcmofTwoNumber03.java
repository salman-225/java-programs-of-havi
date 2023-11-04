package AssessmentTest;

import java.util.Scanner;

public class LcmofTwoNumber03 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number 1");
		int n1=scan.nextInt();
		System.out.println("Enter the number 2");
		int n2=scan.nextInt();
		int lcm=0;
		for(int a=1;a<=n1*n2;a++)
		{
			if(a%n1==0 && a%n2==0 ) 
			{
				lcm=a;
				break;	
			}		
		}
		System.out.println("The Lcm of "+n1+" and "+n2+" is = "+lcm);
	}
}
