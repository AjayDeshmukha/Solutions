

public class BigAndSmall_Num {

	/* Problem 3: Biggest And Smallest Number in an Array  */

	public static void main(String[] args) {
	
//		int array[] = { 1, 2, 3, 4, 5 };
        int array[]= {5,3,7,4,2};
		
		int big = array[0];
		int small = array[0];

		for (int i = 1; i < array.length; i++) {

			if (array[i] > big) {
				big = array[i];
			} 
			else if (array[i] < small) {

				small = array[i];
			}
		}
		System.out.println("Biggest Number in Array is " + big);
		System.out.println("Smallest Number in Array is " + small);
	}
}
