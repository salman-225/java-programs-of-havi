package streams_programs;

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;
	import java.util.stream.Collectors;

	 

	public class StreamsExample {
	    public static void main(String[] args) {
	        List<Integer> list = new ArrayList<>();
	        list.add(1);
	        list.add(2);
	        list.add(2);
	        list.add(2);
	        list.add(1);
	        System.out.println(list);
	        Set<Integer> duplicates = list.stream().map(x -> x).collect(Collectors.toSet());
	        System.out.println(duplicates);
	        List<Integer> squares = list.stream().map(x -> x*x).collect(Collectors.toList());
	        System.out.println(squares);
	        List<String> namesList = new ArrayList<>();
	        namesList.add("dfghj");
	        namesList.add("sadfghj");
	        namesList.add("wqerty");
	        namesList.add("hgfdsa");
	        namesList.add("asdfgh");
	        namesList.add("asdfghjk");
	        namesList.add("asd");
	        namesList.add("jhgfds");
	        List<String> filteredNames = namesList.stream().filter(string -> string.startsWith("a")).collect(Collectors.toList());
	        System.out.println(filteredNames);
	        List<String> sortedNames = namesList.stream().sorted().collect(Collectors.toList());
	        System.out.println(sortedNames);
	    }
	}

