package Date_11_02_2026;

public class StringRevSame {

	public static void main(String[] args) {
		String str="Hello this is java";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println(rev);
	}
}
