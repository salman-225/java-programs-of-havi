package forEach_program;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
	public static void main(String[] args) {
		 List<String> gamesList = new ArrayList<String>();  
	        gamesList.add("Football");  
	        gamesList.add("Cricket");  
	        gamesList.add("Chess");  
	        gamesList.add("Hocky");  
	        System.out.println("------------Iterating by passing method reference---------------");  
	        gamesList.forEach(System.out::println);
	        System.out.println("------------Iterating by passing lamda expresion---------------");  
	        gamesList.forEach(game->System.out.println(game));
	        System.out.println("------------Iterating by passing for each ordered---------------");  
	        gamesList.stream().forEachOrdered(game->System.out.println(game));
	}

}
