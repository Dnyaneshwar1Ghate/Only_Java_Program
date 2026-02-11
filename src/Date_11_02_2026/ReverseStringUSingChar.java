package Date_11_02_2026;

public class ReverseStringUSingChar {

	public static void main(String[] args) {
		
		String str="hello";
		char[]ch=str.toCharArray();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+ch[i];
			
		}
		System.out.println(rev);
	}
	
}
