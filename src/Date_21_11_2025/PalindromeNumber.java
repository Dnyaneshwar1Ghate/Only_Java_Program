package Date_21_11_2025;

public class PalindromeNumber {

	public static void main(String[] args) {

		int num = 131;
		int org = num;
		int rev = 0;
		while (num > 0) {
			
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (rev == org) {
			System.out.println(rev + " is palindrome number");
		} else {
			System.out.println(rev + " is not palindrome");
		}
	}
}
