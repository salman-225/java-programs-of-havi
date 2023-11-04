package streams_programs;

import java.security.cert.X509CRLSelector;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterAndMapStream {
	
	public static void main(String[] args) {
		java.util.ArrayList<Integer>  al=new ArrayList<Integer> ();
		al.add(12);
		al.add(33);
		al.add(55);
		al.add(1);
		al.add(10);
		al.add(1);
		System.out.println(al);
	  
	List<Integer> li=al.stream().filter(x->x%2==0).collect(Collectors.toList());
	System.out.println(li);
	Set<Integer> duplicate= al.stream().map(x->x).collect(Collectors.toSet());
	System.out.println(duplicate);
	Set<Integer> square= al.stream().map(x->x*x).collect(Collectors.toSet());
	System.out.println(square);
	
	}

}
