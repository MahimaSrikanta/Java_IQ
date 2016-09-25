package interview;
/*
Question: Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.

The input string does not contain leading or trailing spaces and the words are always separated by a single space.

For example,
Given s = "the sky is blue",
return "blue is sky the".

Could you do it in-place without allocating extra space?

Solution: first reverse all the letters by letters and then save indices of all space in the sentence  and again reverse the letters to the saved
indices

Complexity Time : O(n^2)

 */


import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_words {


		    public static void main(String[] args) {
		String  s = "Hello how are";
			
			
			
			Scanner input= new Scanner(System.in);
			System.out.println("Enter the sentence to be reversed");
			s= input.nextLine();
			char [] c= s.toCharArray();
			int count =c.length-1;
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			
			
			for (int i=0, j= c.length-1; i< c.length ; i++, j--){
			
		
					   if (i !=j){
						   char temp;
						   temp= c[i];
						   c[i]= c[j];
						   c[j]= temp;

			  }
			  else{
			    
				
				  
				  System.out.println(c);
				  break;
				
			}
			
	 }
	 // Identify all the blanks
	 for (int i=0; i< c.length ; i++){
	   if (c[i] == ' '){
	     list1.add(i);
	   }
	   
	 }
	 list1.add(c.length);
	 reverse(list1,c);
	}

	public static void reverse(ArrayList<Integer> list1, char [] c){
		  int index =0;
		  for (int i =0; i < list1.size(); i++){
		   int j =list1.get(i)-1;
		   
		    while(index< j){
		      char temp= ' ';
		      temp=c[index] ;
		      c[index]= c[j];
		      c[ j]= temp;
		      index++;
		       j--;
		    }
		    index = list1.get(i)+1;
		    
		  }
		  System.out.println(c);
		}
	}