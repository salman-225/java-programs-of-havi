package AssessmentTest2;

import java.util.Collection;
import java.util.Scanner;
import java.util.TreeSet;

public class RemoveDuplicatesArray23 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the Size ");
		int size=scan.nextInt();
		int [] numbers= new int [size];
		for(int i=0;i<=numbers.length-1;i++)
		{
			System.out.println("Enter the values in: "+i);
			numbers[i]=scan.nextInt();
			
		}
		for(int i=0;i<=numbers.length-1;i++)
		{
			System.out.println(numbers[i]);
			
		}
		//corverting array to treeset to remove duplicates
		TreeSet<Integer> ts= new TreeSet<Integer>();
		for(int i=0;i<=numbers.length-1;i++)
		{
			ts.add(numbers[i]);		
		}
		System.out.println(ts);
	}
}
