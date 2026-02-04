package Day_30_01_2026;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {

		String str1 = "listen";
		String str2 = "silent";
		
		str1 = str1.replaceAll("\\s", "").toLowerCase();
		str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths differ, they can't be anagrams
        if (str1.length() != str2.length()) {
            System.out.println("Not anagrams");
            return;
        }
        
        // Convert strings to char arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        
        
        // Sort the arrays
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        // Compare sorted arrays
        if (Arrays.equals(arr1, arr2)) {
        	
            System.out.println("Anagrams");
        } else {
            System.out.println("Not anagrams");
        }
        
		

	}

}
