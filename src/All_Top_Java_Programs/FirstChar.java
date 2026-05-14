package All_Top_Java_Programs;

public class FirstChar {

	public static void main(String[] args) {
		
		String str="automation";
		
		char first='\0';
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j)) 
				{
						first=str.charAt(i);
						break;
				}
			}
			if(first!='\0')
			{
				break;
			}
		}
		
		if(first!='\0')
		{
			System.out.println("Fist Duplicate number is "+first);
		}else {
			System.out.println("not found");
		}
	}
}
