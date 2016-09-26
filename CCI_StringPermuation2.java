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
 * This can also be implemented using hash table
 * 
 * complexity Time: O(n);
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
	//function to check permutation
	public static boolean checkPermutation(String s1, String s2){
		//If string are of unequal length, then return false
		if(s1.length() != s2.length()){
			return false;
		}
		
		// HashMap to store  each char of string as key and its count as value
		Map<Character, Integer> mapper = new HashMap<>();
		for(char c:s1.toCharArray()){
			if (mapper.containsKey(c)){
				int value = mapper.get(c)+1;
				mapper.put(c,value);
				
			}
			else{
			mapper.put(c, 1);
		    }
					
	    }
		
		// Checks Same Hashmap with each char of string as key and its  value as count -1
		for(char c:s2.toCharArray()){
			
			if (mapper.containsKey(c)){
				int value = mapper.get(c)-1;
				mapper.put(c,value);
				
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
