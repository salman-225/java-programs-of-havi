package programs;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinArray {
	
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size= scan.nextInt();
		
		int [] arr= new int [size];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the elements in array :"+i);
			arr[i]=scan.nextInt();
		}
		int a[]=new int[arr.length];//new array for Storage
		Arrays.sort(arr);
		//int temp[] = arr.clone();
		int small=0;
		int large=size-1;
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				a[i]=arr[large--];
				//large--;
			}
			else
			{
				a[i]=arr[small++];
				//small++;
			}
		}
		 System.out.println(Arrays.toString(a));
		
//	for(int j=0;j<a.length;j++)
//		{
//			System.out.println("new array elements are");
//		System.out.println(a[j]);
//		}
//		

}
	}
