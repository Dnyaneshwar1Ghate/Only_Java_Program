package AllProgram;

public class rEMOVEzERO {

	public static void main(String[] args) {
		
		String str="10002100023355000877000";
		char []st=str.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
			if(Character.getNumericValue(st[i])!=0)
			{
				sb.append(st[i]);
			}
			
		}
		System.out.println(sb.toString());
	}
}
