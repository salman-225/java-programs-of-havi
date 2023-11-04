package functinal_interface;

import java.util.function.Predicate;

public class Predicateex2 {
	public static void main(String[] args) {
		String [] s= {"Salman","sulthan","rohan","anji","hai","to"};
		Predicate <String> p= s1->s1.length()>=4;
		for (String s2: s) {
			if(p.test(s2))
			{
				System.err.println(s2);
			}
		}
	}

}
