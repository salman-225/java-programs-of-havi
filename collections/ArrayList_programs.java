package collections;

import java.util.ArrayList;

public class ArrayList_programs {
	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<Integer>(10);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(null);
		al.add(4);
		al.add(5);
		System.out.println(al.size());
		System.out.println(al);
		System.out.println(al.remove(1));
		System.out.println(al);
        
		System.out.println(al);
		System.out.println(al.get(4));
		System.out.println(al.set(3, 8));
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.contains(9));
		 al.clear();
		 System.out.println(al);
		 
		 System.out.println(al.size());
		 
	}

}
