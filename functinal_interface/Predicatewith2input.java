package functinal_interface;

import java.util.function.BiPredicate;

public class Predicatewith2input {
	public static void main(String[] args) {
        BiPredicate<Integer, Integer> predicate = (i1,i2)->i1>i2;
        boolean status = predicate.test(15, 20);
        System.out.println(status);
    }

}
