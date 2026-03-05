package Date_05_03_2026;

public class WithoutUsingMapCHarOccurence {

	public static void main(String[] args) {
		
		countOfChar("Automation");
			
	}
	static void countOfChar(String str) 
	{
		char[]ch=str.toCharArray();
		for(char c:ch)
		{
			if(c!=' ')
			{
				for(int i=0;i<ch.length;i++)
				{
					if(ch[i]==c)
					{
						System.out.println(c+" : "+(i+1));
						
					}
				}
			}
		}
		
	}
}

