package functinal_interface;

import java.util.function.Consumer;

public class Consumer_program {
	public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept("Peter Milanovich");
        Consumer<String> consumerString = (s) -> System.out.println(s.toUpperCase());
        Consumer<Integer> intConsumer = i -> System.out.println(5*i);
        consumerString.accept("High priority");
        intConsumer.accept(4);
   }

}
