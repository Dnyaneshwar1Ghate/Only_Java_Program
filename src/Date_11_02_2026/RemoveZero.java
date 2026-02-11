package Date_11_02_2026;


public class RemoveZero {

	public static void main(String[] args) {
		
		String str="1022021013532121320000201";
		char[] ch=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<ch.length;i++)
		{
			if(Character.getNumericValue(ch[i])!=0)
			{
				sb.append(ch[i]);
			}
		}
		System.out.println(sb.toString());
	}
}
