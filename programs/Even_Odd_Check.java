package programs;

import java.util.Scanner;

public class Even_Odd_Check {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scan.nextInt();
		int [] num= new int[size];
		for (int i = 0; i < num.length; i++) {
			System.out.println("Enter the numbers of index "+i);
			num[i]=scan.nextInt();	
		}
		for (int i = 0; i < num.length; i++) {
			if(num[i]%2==0)
			{
				System.out.println( "even number are : "+num[i]);
			}
			else
			{
				System.out.println("Odd number are : "+num[i]);
			}
			
		}
		
		
		
		
	}
}
