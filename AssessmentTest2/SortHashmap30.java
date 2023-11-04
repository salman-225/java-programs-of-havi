package AssessmentTest2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class SortHashmap30 {
	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter the size");
		int size=scan.nextInt();
		HashMap<Integer,String> map= new HashMap<Integer,String>(size);
		for(int i=0;i<=size-1;i++)
		{
			System.out.println("Enter the key and value in"+i);
			map.put(scan.nextInt(), scan.next());
			
		}
		ArrayList<Integer> al= new ArrayList<Integer>(map.keySet());
		Collections.sort(al);
		System.out.println(al);
	}

}
