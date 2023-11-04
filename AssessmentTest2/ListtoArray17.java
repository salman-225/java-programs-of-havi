package AssessmentTest2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ListtoArray17 {
	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter the size");
		int size=scan.nextInt();
		ArrayList<Integer> al= new ArrayList<Integer>(size);
		
		for(int i=0;i<=size-1;i++)
		{
			System.out.println("Enter the  value in"+i);//inserting the values is arraylist
			al.add(scan.nextInt());
		}
		
		System.out.println(al);
		int[] a= new int[size];
		for(int i=0; i<=size-1;i++ )
		{
			a[i]=al.get(i);//tranfering value from list to array		
		}
		for(int i=0;i<=size-1;i++)
		{
			System.out.println("the array value in "+i+"is :");//displaying the array
			System.out.println(a[i]);
		}
	}

}
