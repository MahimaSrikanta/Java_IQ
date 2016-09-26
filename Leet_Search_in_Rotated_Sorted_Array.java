package interview;

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
