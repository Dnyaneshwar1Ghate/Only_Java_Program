package All_Top_Java_Programs;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num = 1321;
		int rev = 0;
		int orig = num;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		System.out.println(rev);
		if (rev == orig) {
			System.out.println("palindrome");
		} else {
			System.out.println("Not palindrome");
		}

	}
}
