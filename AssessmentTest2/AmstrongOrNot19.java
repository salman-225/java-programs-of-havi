package AssessmentTest2;

import java.util.Scanner;

public class AmstrongOrNot19 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int temp= num;
		int count=0;
		int sum=0;
		while (num!=0)   //count of digit
		{
			count++;
			num=num/10;
		}
		num=temp;
		int lastdigit=0;
		
		while(num!=0)   //power of digit
		{
			int exp=1;
			lastdigit=num%10;
			for(int i=1; i<=count;i++)
			{
				exp=lastdigit*exp;
			}
			num=num/10;
			sum= sum+exp;
			
		}
		if(sum==temp)
		{
			System.out.println("given number is Amstrong");
		}
		else 
		{
			System.out.println("given number is not Amstrong");
		}
	}

}
