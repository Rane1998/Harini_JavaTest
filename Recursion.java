/**
 * 
 */
package test;

/**
 * @author Harini
 *
 */
public class Recursion {

	/**
	 * @param args
	 * 
	 */
	private static int calculateSum(int array[], int x) {
		 
 
        if (x <= 0) {
           return 0;
         }
        
         return calculateSum(array, x-1 ) + array[x-1];
      }
	
		 
	 
	      public static void main(String[] args) {
	 
	         int array[] = {2, 5, 6, 8, 9, 12};
	         int sum = calculateSum(array, array.length);
	 
	          System.out.println(sum);
	      }
	  }
		
		      
		
	
