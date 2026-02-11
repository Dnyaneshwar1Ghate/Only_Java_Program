package Date_11_02_2026;

public class PalindromeNumer {

	public static void main(String[] args) {

		int num = 121;
		int original = num;
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		if (rev == original) {
			System.out.println(rev+" is Palidrome number");
		} else {

			System.out.println(rev+" is not palindome number");
		}
	}
}
