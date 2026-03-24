package date_24_03_2026;

public class PalindDrmeNyum {
	public static void main(String[] args) {
		
		int num=121;
		int rev=0;
		int org=num;
		
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
			
		}System.out.println(rev);
		
		if(org==rev)
		{
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
