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
 * 
 * 
 * complexity Time: O(n);
 *
 * 
 */
import java.util.Scanner;
import java.util.Arrays;
public class CCI_StringPermutation {
	public static void main(String[] args) {
		System.out.println("Enter two Strings which needs to be checked for permutation");
		Scanner input = new Scanner(System.in);
	     String name1 = input.nextLine();
	     String name2 = input.nextLine();
	    if( checkPermute(name1,name2)){
	    	System.out.println("Its a permuation");
	    }
	    else{
	    	System.out.println("Not a Permuation");
	    }
	}
	
	  public static boolean checkPermute(String name1 , String name2){
		  if(name1.length()== name2.length()){
	    	 char [] char1 = name1.toCharArray();
			 char [] char2 = name2.toCharArray();
			 
			 Arrays.sort(char1);
			 Arrays.sort(char2);
	     
	      if(Arrays.equals(char1, char2) ){
	    	  
	    	  return true;
	      }
	      else{
	    	  
	    	  return false;
	      }
	      
	     }
	     else{
	    	 
	    	 return false;
	     }
			 
}
	}

