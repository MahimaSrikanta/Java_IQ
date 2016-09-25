package interview;
/*
 * Question: Implement an algorithm to determine if a string has all unique characters. What
  if you cannot use additional data structures?
  
  Solution: characters are in ASCII values (0-256). 
  This solution creates a boolean array of size 256 and maps the int value of the characters to true.
  If repeated true is encountered, breaks the loop.
  
  
  Complexity : Time = O(n);
  Space Complexity : O(1);
 
 */
import java.util.Scanner;
public class CCI_IsUnique {
	public static void main(String[] args) {
		System.out.println("Enter the String which needs to be checked for unique characters");
		Scanner input = new Scanner(System.in);
	     String name = input.nextLine();
	    boolean status = uniqueChar(name);
	    double name1= 'a';
	  }
	  
	  public static boolean uniqueChar(String name){
		
	    boolean [] check = new boolean[256]; //Creates a boolean array of size 256, with false as its defualt values
	    int value = 0;
	    for(int i =0; i <name.length(); i++){
	      value = name.charAt(i); // Gets the ASCII value of particular character
	      
	   /*Checks if the particular ASCII index of boolean array has false value. If yes sets it to true and continues with loop
	    If No, it means that already that particular character has been indexed (not unique) hence exits the loop and returns  */
	      if(check[value] == false){ 
	    	  check[value]= true;
	      }
	      else{
	    	  System.out.println("String does not has unique characters."+
	      " Repeated " + "'"+ name.charAt(i) + "' " + " breaks the condition initially");
	    	  return false;
	      }
	    }
	    System.out.println("String has unique characters");
	    return true;
	  }

}
