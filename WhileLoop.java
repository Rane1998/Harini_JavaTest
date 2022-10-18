package test;

public class WhileLoop {

	public static void main(String[] args) {
		int array[] = new int[] {1,2,3,4,5};
		
		int sum = 0;
		  int i = 0;
		  while (i < array.length) {
		   sum = sum + array[i];
		   ++i;
		  }
		  System.out.println("Sum from While loop "+sum);
		}
	}


