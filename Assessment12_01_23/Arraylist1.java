package Assessment12_01_23;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist1 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the no.of elements u want to store");
		int size= scan.nextInt();
		ArrayList list= new ArrayList();
		for(int i=0; i<=size-1;i++)
		{
			System.out.println("Enter the number in list index: "+i);
		list.add(scan.nextInt());
		}
		System.out.println(list);
		list.set(4, 8);
		list.remove(2);
		System.out.println(list);
		System.out.println("the size of list is: "+list.size());
		System.out.println("Enter the  value for checking present or not");
		int n=scan.nextInt();
       if(list.contains(n))
       {	
		System.out.println("The given value is present  the in list");
       }
       else
       {
    	   System.out.println("the given value is not present in the list");
       }
       System.out.println("Enter the portion of list u want to retrive");
       System.out.println("Enter the  Start of index");
       int z=scan.nextInt();
       System.out.println("Enter the  end of index");
       int y=scan.nextInt();
      System.out.println(list.subList(z, y)); 
		
	}

}
