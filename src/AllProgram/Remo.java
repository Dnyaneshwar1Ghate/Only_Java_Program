package AllProgram;

public class Remo {

	public static void main(String[] args) {
		
		String str="102125400021354";
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
