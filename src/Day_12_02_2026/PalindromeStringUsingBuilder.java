package Day_12_02_2026;

public class PalindromeStringUsingBuilder {

	public static void main(String[] args) {
		
		String str="madam";
		String rev=new StringBuilder(str).reverse().toString();
		if(str.equals(rev)) {
			System.out.println("palindrome String ");
		}
		else {
			System.out.println("no palindrome String ");
		}
	}
}
