package programs;

import java.util.Scanner;

public class numberReverse {
	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		System.out.println("the given num is : "+num);
		int lastdigit=0;
		int reverse= 0;
		while(num!=0)
		{
			lastdigit= num%10;
			reverse= reverse*10+lastdigit;
			num=num/10;
			
			
		}
		System.out.println("The reverse of num is : "+reverse);
		
	}

}
