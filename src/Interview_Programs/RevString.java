package Interview_Programs;

public class RevString {
	
	public static void main(String[] args) {
		String str="Hello Java";
		String rev="";
		String sp[]=str.split(" ");
		for(int i=sp.length-1;i>=0;i--)
		{
			rev=rev+" "+sp[i];
			
		}
		System.out.println(rev);
		
		
	}

}
