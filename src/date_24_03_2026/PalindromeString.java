package date_24_03_2026;

public class PalindromeString {

	public static void main(String[] args) {

		String str="1madam1";
		
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
		if(str.endsWith(rev))
		{
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
	}

}
