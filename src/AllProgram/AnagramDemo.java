package AllProgram;

import java.util.Arrays;

public class AnagramDemo {
	public static void main(String[] args) {

		String s1 = "eat";
		String s2 = "ate";

		if (isAnagram(s1, s2)) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}

	}

	static boolean isAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			
			return false;
			
		}

		char[] a1 = s1.toCharArray();
		char[] a2 = s2.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		return Arrays.equals(a1, a2);
	}
}
