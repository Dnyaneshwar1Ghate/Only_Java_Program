package Programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		String s1="eat";
		String s2="atfq";
		
		if(s1.length()!=s2.length())
		{
			System.out.println("not anagram");
			return;
			
		}
		
		char []ch1=s1.toCharArray();
		char []ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("Anagram");
		}else {
			System.out.println("not anagram");
		}
		
		
		
	}
}
