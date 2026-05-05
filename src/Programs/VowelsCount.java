package Programs;

public class VowelsCount {

	public static void main(String[] args) {
		String str="abcdefghijklmnopqrstuvwxyz";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count ++;
				System.out.print(ch +"  "); 
				
				
			}
			
		}
		
		System.out.print("\nTotal vowels count is :"+count);
	}
}
