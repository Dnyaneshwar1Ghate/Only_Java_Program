package Date_11_02_2026;

public class ZeroRemove {

	public static void main(String[] args) {
		
		String str="50124569874000215003";
		char[] ch=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			if(Character.getNumericValue(ch[i])!=0)
			{
				sb.append(ch[i]);
			}
		
		}
		System.out.println(sb.toString());
		
	}
}
