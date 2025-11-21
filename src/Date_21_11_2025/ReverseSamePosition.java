package Date_21_11_2025;

public class ReverseSamePosition {
	
	public static void main(String[] args) {
		
		String str="Hello Java";
		String rev="";
		String sp[]=str.split(" ");
		for(int i=0;i<sp.length;i++)
		{
			String temp=sp[i];
			String internalRev="";
			for(int j=temp.length()-1;j>=0;j--)
			{
				internalRev=internalRev+temp.charAt(j);
				
			}
			rev=rev +" "+internalRev;
		}
		System.out.println(rev);
		
	}

}
