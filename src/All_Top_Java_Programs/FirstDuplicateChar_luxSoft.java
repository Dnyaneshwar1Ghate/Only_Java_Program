package All_Top_Java_Programs;

public class FirstDuplicateChar_luxSoft {

	public static void main(String[] args) {

		String str = "programming";
		
		char firstDuplicate = '\0';
		
		for (int i = 0; i < str.length(); i++) {
			
			for (int j = i + 1; j < str.length(); j++) {
				
				if (str.charAt(i) == str.charAt(j)) {
					firstDuplicate = str.charAt(i);
					break;
				}
			}
			
			if (firstDuplicate != '\0') {
				
				break;
			}
		}

		if(firstDuplicate!='\0')
		{
			System.out.println("first duplicate number is "+firstDuplicate);
		}else {
			System.out.println("noany duolicate charactor");
		}
			
	}
}
