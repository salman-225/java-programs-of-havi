package AssessmentTest2;

import java.util.Scanner;

public class SunnyNumberorNot22 {
	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter the number to check given number is sunny or not");
		
		int num=scan.nextInt();
		int num2=num+1;
		for(int i=1;i<=num2;i++)
		{
			if(num2%i==0 && i*i==num2)
			{
				System.out.println("given number is sunny");
				break;
			}		
		}
	}
}
