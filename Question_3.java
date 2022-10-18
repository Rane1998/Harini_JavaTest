/**
 * 
 */
package test;

/**
 * @author Harini
 *
 */
public class Question_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		{
	        int  a = 0, b = 0, c = 1;
	        System.out.print("First 100 Fibonacci numbers\n:");
	        for(int i = 1; i <= 100; i++)
	        {
	            a = b;
	            b = c;
	            c = a + b;
	            System.out.print(a+" ");
	        }
	    }

	}

}
