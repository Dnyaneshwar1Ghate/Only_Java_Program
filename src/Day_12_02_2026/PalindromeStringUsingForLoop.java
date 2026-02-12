package Day_12_02_2026;

public class PalindromeStringUsingForLoop {

	public static void main(String[] args) {
		
		String str="ALALALA";
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		System.out.println(str);
		if(str.equals(rev))
		{
			System.out.println("palindroe String");
		}else {
			System.out.println("not palindrome String");
		}
		
	}
}
