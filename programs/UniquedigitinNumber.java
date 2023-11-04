package programs;

import java.util.Scanner;

public class UniquedigitinNumber {
	
	public static int countofuniquedigit(int num)
	{
		int [] arr= new int[10];
		int ld=0;
		int count=0;
		while(num!=0){
			ld=num%10;
			if(arr[ld]==0)
			{
				arr[ld]=1;
				count++;
				
			}
			num=num/10;
			
		}
		return count;
		
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		int result= countofuniquedigit(num);
		System.out.println(result);
	
		
		
		
	}

}
