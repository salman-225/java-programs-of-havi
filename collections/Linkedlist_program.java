package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist_program {
	public static void main(String[] args) {
		
	
	LinkedList<String> li = new LinkedList <String>();
	li.add("Havi");
	li.add("Solutions");
	li.add("madhapur");
	li.add("is great");
	System.out.println(li);
	
	System.out.println(li.size ());
	Iterator<String> iter= li.iterator();
	while(iter.hasNext()) {
		System.out.println(iter.next());
	}
	
	
	}

}
