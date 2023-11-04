package functinal_interface;

import java.util.function.Predicate;

public class Predicate_program {
	public static void main(String[] args) {
		
		 Predicate<Integer> greaterThanTen = i-> i>10 ;
	        Predicate<Integer> lessThanTwenty = i->i<=20;
	        boolean status = greaterThanTen.and(lessThanTwenty).test(20);
	        System.out.println(status);
	    
	}

}
