package Date_05_03_2026;

public class Char1 {

	static void charCount(String str) {

		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			for (int j = i + 1;j<ch.length; j++) {
				
				if(ch[i]==ch[j])
				{
					count ++;
					ch[j]='0';
				}
			}
			if(ch[i]!='0'&& ch[i]>1&& ch[i]!=' ')
			{
				System.out.println(ch[i]+":"+count);
			}
		}

	}

	public static void main(String[] args) {
		charCount("hellohelohelohellohello hello elloehello");
	}
}
