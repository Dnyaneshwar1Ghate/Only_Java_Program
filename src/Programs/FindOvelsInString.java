package Programs;

import java.util.Scanner;

public class FindOvelsInString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = sc.next();
		System.out.print("Vowels is : ");
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.print(ch+" ");

			}
		}
		System.out.print("\nConsonents is : ");
		for (int i = 0; i < str.length(); i++) {

			char ch=str.charAt(i);
			if(!(ch=='a'||ch=='e'||ch=='i'|ch=='o'||ch=='u'))
			{
				System.out.print(ch+" ");
			}
		}

	}

}
