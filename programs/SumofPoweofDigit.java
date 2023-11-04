package programs;

import java.util.Scanner;

public class SumofPoweofDigit {
public static void main(String[] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("enter the number");
	int num=scan.nextInt();
	int ld=0;
    int sum=0;
	
	
	while(num!=0)
	{
		int temp=1;
		ld=num%10;
        int product=1;
		if(num<1000&& num>100)
		{
			product=product;	
		}
		if(num<100&& num>10)
		{
			for (int i=1;i<=3;i++)
			{
				product=product*ld;
			}
		}
		if (num<10 &&num>0)
		{
			for (int i=1;i<=2;i++)
			{
				product=product*ld;
			}
		}
		//System.out.println("Enter the power for digit: "+ld);
		//int power= scan.nextInt();		
		//for (int i=1;i<=power;i++)
		//{
		//temp*=ld;
		//}
		//temp=Math.pow(ld, power);
		sum=sum+product;
		num=num/10;
		
	}
	System.out.println(sum);
	
}

}
