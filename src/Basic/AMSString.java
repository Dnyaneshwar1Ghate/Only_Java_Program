package Basic;

import java.util.Arrays;

public class AMSString {

	public static void main(String[] args) {

		String s1 = "a1te";
		String s2 = "eat";

		char[] st1 = s1.toCharArray();
		char[] st2 = s2.toCharArray();

		Arrays.sort(st1);
		Arrays.sort(st2);

		String string1=new String(st1);
		String string2=new String(st2);
		if(string1.equalsIgnoreCase(string2))
		{
			System.out.println("amstriog");
		}else
		{
			System.out.println("not");
		}
	}
}
