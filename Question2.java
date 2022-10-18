/**
 * 
 */
package test;

import java.util.Arrays;

/**
 * @author Harini
 *
 */
public class Question2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[] = new int[] {1,2,3};
		
		String[] arr =new String[]{"a","b","c"};
		
		int length_arr1 = array.length;
		int length_arr2 = arr.length;
		
		int total = length_arr1+length_arr2;
		
		 int[] new_array  = new int [total]; 
		 
		 System.arraycopy(); 
	        System.arraycopy(); 
	  
	        // prints the resultant array 
	        System.out.println(Arrays.toString(new_array)); 
	    } 
		
	}

}
