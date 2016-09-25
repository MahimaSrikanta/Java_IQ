/*
 
* Question: Given two strings s and t, determine if they are isomorphic. Two strings are isomorphic if the characters in s can be replaced to get t.
			 For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.
			 
* Solution: Check if both words are of equal length and then create set1 and set2 out of word1 and word2 respectively and return TRUE or FALSE
based on length of each set.corner case: abcd , efdd

* Complexity Time : O(n)	
 
*/

package interview;
import java.util.*;

public class Isomorphic_Strings {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the first word");
		String word1 = input.next();
		System.out.println("Enter the second word");
		String word2 = input.next();
		
		boolean result= isisomorphic(word1,word2);
		System.out.println(result);
	}
	
	public static boolean isisomorphic(String word1, String word2){
		
		if(word1 == null || word2 == null){
			return false;
			
		}
		if (word1.length() != word2.length()){
			return false;
		}
		
		Set<Character> set1 = new HashSet<>();
		Set<Character> set2 = new HashSet<>();

		
		for(int i =0; i<word1.length();i++){
			set1.add(word1.charAt(i));
			
		}
		
		
		for(int i =0; i<word2.length();i++){
			set2.add(word2.charAt(i));
			
		}
		
		if (set1.size() == set2.size()){
			return true;
		}
		
		else{
			return false;
	}
}

}
