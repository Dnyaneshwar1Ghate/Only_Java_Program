package Date_01_04_26;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		int num=121;
		int rev=0;
		int org=num;
		
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
			
		}
		System.out.println(rev);
		if(rev==org)
		{
			System.out.println("palindrome");
		}else
		{
			System.out.println("not palindrome");
		}
	}
}
