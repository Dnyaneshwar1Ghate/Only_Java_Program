package Basic;

import java.util.Arrays;

public class AmstrongString {

	public static void main(String[] args) {

		String str1 = "eat";
		String str2 = "tea";

		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		String new1 = new String(arr1);
		String new2 = new String(arr2);

		if (new1.equalsIgnoreCase(new2)) {
				System.out.println("String is amstrong");
		}else{
			System.out.println("String is not amstrong");
		}

	}
}
