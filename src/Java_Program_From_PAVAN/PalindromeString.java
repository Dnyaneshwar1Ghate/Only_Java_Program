package Java_Program_From_PAVAN;

public class PalindromeString {

	public static void main(String[] args) {
		String str = "MADsAM";
		String rev = "";
		char a[] = str.toCharArray();
		String org=str;

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + a[i];

		}
		System.out.println(rev);
		if(rev.equals(org))
		{
			System.out.println("this is string is palindrome");
		}else {
			System.out.println("this string is not palindrome");
		}

	}

}
