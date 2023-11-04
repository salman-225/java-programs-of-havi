package AssessmentTest2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ArraylistinAscending14 {
	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter the size");
		int size=scan.nextInt();
		ArrayList <Integer> list= new ArrayList<Integer>(size);
		
		for(int i=0;i<=size-1;i++)
		{
			System.out.println("Enter the element in list");
			list.add(scan.nextInt());
		}
		System.out.println("before sorting list: "+list);
		Collections.sort(list);
		System.out.println("Ascending  order of list: "+list);
		
		
	}

}
