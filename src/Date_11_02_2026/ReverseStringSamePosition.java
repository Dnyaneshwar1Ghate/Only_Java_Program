package Date_11_02_2026;

public class ReverseStringSamePosition {
	
	public static void main(String[] args) {
		
		String str="hello Java";
		String [] st=str.split(" ");
		String rev="";
				
		for(int i=0;i<st.length;i++)
		{
			String word=st[i];
			String inRev="";
			for(int j=word.length()-1;j>=0;j--)
			{
				inRev=inRev+word.charAt(j);
				
			}
			rev=rev+inRev+" ";
		}
				
		System.out.println(rev);
	}

}
