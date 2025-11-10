package Java_Program_From_PAVAN;

public class ReverseNumber {

	public static void main(String[] args) {

		int num=123;
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
			System.out.println("number is palindrome");
		}else
		{
			System.out.println("number is not palindrome");
		}
	}

}
