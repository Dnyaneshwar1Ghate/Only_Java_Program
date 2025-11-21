package StringDemo;

public class String3Demo {
	public static void main(String[] args) {
		
		String str="Java String Reverse Program";
		String st[]=str.split(" ");
		String rev="";
		
		for(int i=0;i<st.length;i++)
		{
			String temp=st[i];
			String revIn="";
			for(int j=temp.length()-1;j>=0;j--)
			{
				revIn=revIn+temp.charAt(j);
			}
			rev=rev+" "+revIn;
			
		}
		System.out.println(rev);
		
	}
}
