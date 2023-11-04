package Assessment12_01_23;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmaptask {
	public static void main(String[] args) {
		Scanner  scan=new Scanner (System.in);
		System.out.println("Enter the size of hm map ");
		int size=scan.nextInt();
		HashMap<Integer, String> hm= new HashMap<>(size);
		for(int i=0;i<=size-1;i++) {
		System.out.println("Enter the elements in hm");
		System.out.println("Enter the Key value");
		int j=scan.nextInt();
		System.out.println("Enter the String value");
		String k=scan.next();
		
		hm.put(j,k);
		}
		
		System.out.println(hm);
		System.out.println("Enter the  key values which you want retrive and which has pair");
		System.out.println("Enter the Key value");
		int m=scan.nextInt();
		System.out.println("Enter the String value");
		String o=scan.next();
		
		if(hm.containsKey(m)&&hm.containsValue(o))
		{
		System.out.println(hm.getOrDefault(m,o));
		}
		else 
		{
			System.out.println("it does not have pair");
		}
		System.out.println("Enter the  key values which you want remove ");
		int n= scan.nextInt();
		hm.remove(n);
		System.out.println(hm);
	


	}
	
}
