package StringDemo;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String str="etahg rawhsenaynd urhcak";
		
		String st[]=str.split(" ");
	
		String rev="";
		for(int i=0;i<st.length;i++)
		{
			String tmp=st[i];
			String inRev="";
			for(int j=tmp.length()-1;j>=0;j--)
			{
				inRev=inRev+tmp.charAt(j);
			}
			rev=rev+" "+inRev;
		}
		System.out.println(rev);
	}

}
