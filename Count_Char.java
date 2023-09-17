import java.util.Scanner;

public class Count_Char {

	/* Program 1: Program to count occurrences of a Given character in a string  */

	public void count() {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char e = 'e';
		char a = 'a';
		int count_e = 0;
		int count_a = 0;
		for (int i = 0; i < str.length(); i++) {
			if (e == str.charAt(i)) {
				count_e++;
			} else if (a == str.charAt(i)) {
				count_a++;
			}

		}
		System.out.println(count_e);
		System.out.println(count_a);
	}

	public static void main(String[] args) {
		Count_Char obb = new Count_Char();
		obb.count();

	}

}
