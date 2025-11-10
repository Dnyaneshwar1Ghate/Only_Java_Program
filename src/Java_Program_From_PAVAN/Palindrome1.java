package Java_Program_From_PAVAN;

public class Palindrome1 {
	
	public static void main(String[] args) {
		
		int num=1245;
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
