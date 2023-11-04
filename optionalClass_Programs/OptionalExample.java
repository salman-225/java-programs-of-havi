package optionalClass_Programs;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
		String [] s= new String [10];
		s[0]="havi";
	    s[1]="Soluction";
	    System.out.println(s[0]);
	  //  System.out.println(s[3].length());// here we get null pointer exception.
	    Optional <String> check = Optional.ofNullable(s[1]);
	    //System.out.println(check.isPresent());
	    if (check.isPresent())
	    {
	    	//System.out.println("value is present" + s[1].toUpperCase());
	    	System.out.println(check.get());//printing the value by using the get method
	    	System.out.println(s[1].toUpperCase());
	    }
	    else
	    {
	    	System.out.println("value is not present");
	    }
	    System.out.println(check.hashCode());// we will hashcode
	    System.out.println(check.isPresent());//we will get ture/false
	    check.ifPresent(System.out::println);//if it has value we will get value or empty
	    System.out.println(check.orElse("value not present"));//it returns value if value is presente else messge will displayed
	    
	}

}
