package interview;
/*
 * Question: Suppose a sorted array is rotated at some pivot unknown to you beforehand. (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 *           You are given a target value to search. If found in the array return its index,
 *           otherwise return -1. You may assume no duplicate exists in the array.
 *           
 * Solution: Using binary search with extra if conditions. check which side of mid point is sorted by comparing the mid point and staring point
 *           (condition 1. starting point is less then mid point, then  left side is sorted else right side is sorted) then check if target key lies
 *            in sorted part of array and  go on applying binary search on the sorted side, if the target key lies in unsorted side, 
 *            then go on checking within unsorted side which part is sorted and applying binary search
 *            
 * complexity Time: O(logn)
 *           
 *  
 */
import java.util.*;
public class Leet_Search_in_Rotated_Sorted_Array {
	public static void main(String[] args){
		System.out.println("Enter the size of the rotated sorted array" );
		Scanner input = new Scanner(System.in);
		int len = input.nextInt();
		
		int[] array= new int[len];
		
		System.out.println("Enter the values of the rotated sorted array" );
		for(int i =0; i< len; i++){
			array[i]= input.nextInt();
		}
		
		System.out.println("Enter the value to be searched" );
		int key = input.nextInt();
		
		//Call the search method
		int result =binary_search(array,key);
		System.out.println("The search value is at : " + result);
	}

	public static int binary_search(int[] array, int key){
		int left = 0;
		int right = array.length-1;
		
		while(left<=right){
			int mid= (right+left)/2;
			
			if(key == array[mid]){
				return mid;
			}
			
			//If left side of mid  is sorted 
			if(array[left]< array[mid]){
				//then check if key is left or within left and mid
				if(array[left]<= key &&  key < array[mid]){
					right = mid-1;
				}
				//else key is in unsorted side of mid point
				else{
					left= mid+1;
				}
			}
			
			//Else right side of mid is sorted
			else{
				//then check if key is within mid and right or right
				if(array[mid]<key && key <= array[right]){
					left = mid+1;
				}
				//else key is in unsorted side of midpoint
				else{
					right = mid-1;
				}
			}
		}
		
		return -1;
		
	}
}
