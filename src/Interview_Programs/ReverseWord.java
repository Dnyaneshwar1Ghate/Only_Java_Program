package Interview_Programs;

public class ReverseWord {
	
	public static void main(String[] args) {
		
		String str="Hello java";
		String st[]=str.split(" ");
		
		String rev="";
		for(int i=0;i<st.length;i++)
		{
			String temp=st[i];
			String revIn="";
			for(int j=temp.length()-1;j>=0;j--)
			{
				rev=rev+temp.charAt(j);
			
			}
			rev=rev+" ";
		}
		System.out.println(rev);
	}

}
