package AllProgram;

import java.util.Arrays;

public class AnagraminSimpleWay {
	
	public static void main(String[] args) {
		
		String s1="atep";
		String s2="eat";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("not anagram");
			return;
		}
		
		char []a1=s1.toCharArray();
		char []a2=s2.toCharArray();
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		if(Arrays.equals(a1,a2))
		{
			System.out.println("anagram");
		}else
		{
			System.out.println("not anagram");
		}
		
	}

}
