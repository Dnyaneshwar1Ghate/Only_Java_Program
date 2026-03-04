package date_04_03_2026;

public class ChaacterOccurence {
	
	public static void main(String[] args) {
		
		String str="Automation";
		char ch=str.charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(ch+" "+count );
		
	}

}
