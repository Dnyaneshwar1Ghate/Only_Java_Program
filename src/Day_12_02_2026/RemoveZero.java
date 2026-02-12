package Day_12_02_2026;

public class RemoveZero {

	public static void main(String[] args) {
		
		String str="41021503256012450213650";
		char []ch=str.toCharArray();
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
