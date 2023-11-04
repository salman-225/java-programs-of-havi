package functinal_interface;

import java.util.function.BiConsumer;

public class BiConsumer_program {
	 public static void main(String[] args) {
	        BiConsumer<String,String> consumer = (s,p) -> System.out.println(s+""+p);

	        BiConsumer<String,String> consumerString = (s,p) -> System.out.println(s.toUpperCase()+""+p.toLowerCase());
	        consumer.accept("Peter Milanovich","Hello");// Peter Milanovich
	        consumerString.accept("High priority","LOWER CASE");// HIGH PRIORITY
	    }

}
