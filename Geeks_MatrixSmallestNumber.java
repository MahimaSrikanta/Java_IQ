package interview;
/*
 * Question: Find the kth smallest element in row wise and column wise sorted matrix. (No Heap solution)
 *           Given an n x n matrix, where every row and column is sorted in non-decreasing order. Find the kth smallest element in the given 2D array.

For example, consider the following 2D array.

        10, 20, 30, 40
        15, 25, 35, 45
        24, 29, 37, 48
        32, 33, 39, 50
The 3rd smallest element is 20 and 7th smallest element is 30


 * Solution: 
 * 
 * 
 */

import java.util.*;
public class Geeks_MatrixSmallestNumber {

	public static void main(String[]args){
		int[][] matrix = {{10, 20, 30, 40},
				          {15, 25, 35, 45},
				          {24, 29, 37, 48},
				          {32, 33, 39, 50}
		                 };
		
		//System.out.println("Enter which smallest element should be displayed: ");
		Scanner input = new Scanner(System.in);
		//int kValue = input.nextInt();
			
		//Create an arraylist result
		ArrayList<Integer> result = new ArrayList<>();
		for (int i =0; i < matrix.length; i++){
			for (int j=0; j< matrix[0].length; j++){
				result.add(matrix[i][j]);
			}
		}
		
		System.out.println(result.toString());
		
	
	    //Merge sort on this result arraylist
		ArrayList<Integer> output = new ArrayList<>();
		int i=0, k =4, j=8, l=12, counter =0;
		while(counter < 7){
			if(result.get(i)<=result.get(k)){
				output.add(result.get(i));
				i++;
			}
			else{
				output.add(result.get(k));
				k++;
			}
			counter++;
		}
		
		System.out.println(output.toString());
		
}
}
