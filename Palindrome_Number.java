import java.util.Scanner;

public class Palindrome_Number {

	/* Problem 2: Determine whether a Given String is palindrome*/
	public void palindrome() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String : ");
		String str = sc.nextLine();
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.toLowerCase().equals(rev.toLowerCase())) {
			System.out.println("True");
		} else {
			System.out.println("False");

		}
	}

	public static void main(String[] args) {
		Palindrome_Number obb = new Palindrome_Number();
		obb.palindrome();

	}

}
