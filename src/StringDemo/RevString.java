package StringDemo;

public class RevString {
	
	public static void main(String[] args) {
		
		String str="Hello Java";
		String rev="";
		String sp[]=str.split(" ");
		for(int j=0;j<sp.length;j++)
		{
			String temp=sp[j];
			String temRev="";
			for(int i=temp.length()-1;i>=0;i--)
			{
				temRev=temRev+str.charAt(i);
				
			}
			rev=rev+" "+temRev;
			
		}
		System.out.println(rev);
	}

}
