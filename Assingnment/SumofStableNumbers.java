package Assingnment;

import java.util.Arrays;
import java.util.Scanner;

public class SumofStableNumbers {
	public static  int n;
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size=scan.nextInt();
		String [] num=new String[size];
		int sum=0;
		
		
		for(int u=0;u<=num.length-1;u++)
		{
		     System.out.println("Enter the elements in : "+u);
			  num[u]=scan.next();
		}
		for(int i=0;i<num.length;i++)//to take number from the array ex1234
		{
			boolean status =false;
			int[] count= new int[num[i].length()];
			for (int j=0;j<num[i].length();j++)//to split the num individual ex 1  2  3 4
			{
				
					for(int k=0;k<num[i].length();k++) //compare individual char 1with all the charrex 1234
					{
						if(num[i].charAt(j)== num[i].charAt(k))
						{
							count[j]++;
						}
						
					}
					

			}
			for(int l=i+1; l<num[i].length();l++) 
			{
				if(count[0]==count[l]) 
				{
					status=true;
				}
				else 
				{
					status=false;
					System.out.println(num[i] +" is not stable number");
					break;	
				}
			
			}
			if(status) 
			{
				
				
				for(int z=0;z<num.length;z++)
				{
					 String number=num[i];
					 n=Integer.parseInt(number);
					 
				}
				
				sum=sum+n;
				System.out.println(num[i]+"is stable number");
			
			
				
		 	}
			
			
		
		}
		System.out.println("the sum of stablenumber is "+sum);
		
		
	}

}
