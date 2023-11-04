package collections;

import java.util.PriorityQueue;

public class Queue_program {
	public static void main(String[] args) {
		PriorityQueue<Integer> qu= new PriorityQueue<>();
		qu.add(10);
		qu.add(30);
		qu.add(40);
		qu.add(27);
		System.out.println(qu);
		qu.remove(10);
		System.out.println(qu);
	}
	

}
