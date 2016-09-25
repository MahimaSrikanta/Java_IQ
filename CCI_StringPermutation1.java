package interview;
/*
 * Question: Given two strings, write a method to decide if one is a permutation of the other.
 * 
 * Solution: This solution first checks for the equal length of two strings and then 
 * sorts both the String by converting to char array and comparing each chars of both string to check if same or not
 * 
 * Example of String permutation are :
 * Permuation of ABC  : ABC,ACB,BAC,BCA,CAB,CBA  
 * 
 * This can also be implemented using hashtable
 * 
 * complexity Time: O(n);
 * 
 * 
 */
import java.util.Scanner;
import java.util.Arrays;
public class CCI_StringPermutation1 {
	public static void main(String[] args) {
		System.out.println("Enter two Strings which needs to be checked for permutation");
		Scanner input = new Scanner(System.in);
	     String name1 = input.nextLine();
	     String name2 = input.nextLine();
	
	     if(name1.length()== name2.length()){
	    	 char [] char1 = name1.toCharArray();
			 char [] char2 = name2.toCharArray();
			 
			 Arrays.sort(char1);
			 Arrays.sort(char2);
			 checkPermute(char1,char2);
	     
	     }
	     else{
	    	 System.out.println(name1 + " is not a permutation of " + name2);
	     }
	  }

	public static void checkPermute(char[] name1 , char[] name2){
		for(int i =0; i <name1.length; i++){
			if (name1[i]!= name2[i] ){
				System.out.println("Not a permutation");
				return;
			}
		}
		
			System.out.println("Is a permutation");
		
		
	}

}