package Java_Program_From_PAVAN;

public class ReverseString2 {
	
	public static void main(String[] args) {
		
		String str="Hello";
		String rev="";
		char[]a=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+a[i];
	
		}
		System.out.println(rev);
	}

}
