
public class SwapTwoNumber {

	public static void main(String[] args) {

		/* Problem 5: Swap Two Number Without using a temporary variable  */

		int a = 10;
		int b = 50;
		System.out.println("Before swapping:" + " a = " + a + ", b = " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping:" + " a = " + a + ", b = " + b);

	}

}
