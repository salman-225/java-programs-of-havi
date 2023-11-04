package AssessmentTest2;

import java.util.Arrays;

import java.util.Scanner;

public class SumclosetoZero21 {
public static void main(String[] args) {
	Scanner scan =new Scanner (System.in);
	System.out.println("Enter the elements in array ");
	System.out.println("enter the size of array");
	int size=scan.nextInt();
	int [] arr=new int[size];
	for(int i=0;i<=size-1;i++)
	{
		System.out.println("enter the Element "+i);
		arr[i]=scan.nextInt();	
	}
	Arrays.sort(arr);
	
	int sum=arr[0]+arr[1];
	System.out.println("the two elements whoes sum is near to zero are"+arr[0]+"and "+arr[1]);
	System.out.println("the sum is : "+sum);


}

}
