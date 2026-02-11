package Date_11_02_2026;

public class RevString {

	public static void main(String[] args) {
		
		String str="hello this is java ";
		String[] st=str.split(" ");
		String rev="";
		for(int i=0;i<st.length;i++)
		{
			String word=st[i];
			String inrev="";
			for(int j=word.length()-1;j>=0;j--)
			{
				inrev=inrev+word.charAt(j);
			}
			rev=rev+inrev+" ";
		}
		System.out.println(rev);
	}
}
