package test;

public class Sum {

	public static void main(String[] args) {
	
		int array[] = new int[] {1,2,3,4,5};
		
		
		
		System.out.println("Sum from for loop " +sumFromForLoop(array));
		
		

	}
	
	public static int sumFromForLoop(int[] array) { // Some from for loop
		
		int sum = 0;
		for (int i = 0 ; i<array.length;i++) {
			
			sum = sum+array[i];
		
}
		return sum;	
	}
	

	


}


