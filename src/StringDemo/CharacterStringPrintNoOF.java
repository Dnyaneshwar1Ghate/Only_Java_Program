package StringDemo;

public class CharacterStringPrintNoOF {
	
	public static void main(String[] args) {
		
		String string="a2b3d4";
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0;i<string.length();i++)
		{
			Character curent=string.charAt(i);
			
			if(Character.isLetter(curent))
			{
				int count=Character.getNumericValue(string.charAt(i+1));
				
				for(int j=0;j<count;j++)
				{
					sb.append(curent);
				}
			}
		}
		System.out.println(sb.toString());
	}

}
