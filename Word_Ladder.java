package interview;
import java.util.*;

class Ladder{
	
	public void wordladders(String start, String end, Set set1 ){
		set1.add(start);
		set1.add(end);
		//Print the whole set
		System.out.println(set1);
		
		//Declaring variables
		Set<String> result = new HashSet<>();
		Set<String> current = new HashSet<>();
		Set<String> visited = new HashSet<>();
		boolean found = false;
		Map<String, String> trace = new HashMap<>();
		String currentWord = " ";
		
		
		while((current != null) && (!found)){
			for(String word : current){
				visited.add(word);
				currentWord = word;
			}
			Set<String> next = new HashSet<>();
			Set<Character> check = new HashSet<>();
			
			for(Object words: set1){
				for (int i =0; i <3;i++){
					check.add(words.toString().toCharArray()[i]);
					check.add(currentWord.toCharArray()[i]);
					if (check.size() == 4){
						if (words == end){
							found= true;
						}
						
						next.add(words.toString());
						trace[]
					}
					
				}
				
			}
			
		}
		
		
		
		
		
	}
}



public class Word_Ladder {
	public static void main(String[] args) {
		String start= "hit",end= "cog";
		
		//Creating a set with collections as list and then convert to set
		Set<String> set1 = new HashSet<>(Arrays.asList("hot","dot","dog","lot","log"));
		
		//Creating Ladder object and calling wordladder function
		Ladder lad = new Ladder();
		lad.wordladders(start, end, set1);
		
		
	}

}

