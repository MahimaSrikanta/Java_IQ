package interview;
/*
 * Question: Given two strings, write a method to decide if one is a permutation of the other.
 * 
 * Solution: This solution first checks for the equal length of two strings and then 
 * stores each character as key, count as value in hash table for first string. second string 
 * checks if the key exists if yes, reduces the count. then check if all vaues of keys in hashtable is 0
 * 
 *  
 * 
 * Example of String permutation are :
 * Permuation of ABC  : ABC,ACB,BAC,BCA,CAB,CBA  
 * 
 * This can also be implemented using hashtable
 * 
 * complexity Time: O(nlogn);
 * 
 * 
 */
import java.util.*;
public class CCI_StringPermuation2 {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two strings for checking the permutation");
		String string1= input.nextLine();
		String string2 = input.nextLine();
		//Calling the check permutation function
		
		if(checkPermutation(string1, string2)){
			System.out.println("Strings are permutation of each other ");
		}
		else{
			System.out.println("Strings are not permutation of each other ");
		}
		
	}
	public static boolean checkPermutation(String s1, String s2){
		if(s1.length() != s2.length()){
			return false;
		}
		Map<Character, Integer> mapper = new HashMap<>();
		for(int i =0; i < s1.length(); i++){
			char key = s1.charAt(i);
			if (mapper.containsKey(key)){
				int value = mapper.get(key)+1;
				mapper.put(key,value);
				
			}
			else{
			mapper.put(key, 1);
		    }
					
	    }
		
		for(int i =0; i < s2.length(); i++){
			char key = s2.charAt(i);
			if (mapper.containsKey(key)){
				int value = mapper.get(key)-1;
				mapper.put(key,value);
				
			}
			else{
				return false;
			}
		
		}
		
		//Checking if all the values of the existing keys are 0 or not
		for( char c : mapper.keySet()){
			if(mapper.get(c) !=0){
				return false;
			}
		}
		return true;

}
}
