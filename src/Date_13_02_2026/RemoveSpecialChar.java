package Date_13_02_2026;

public class RemoveSpecialChar {

	public static void main(String[] args) {
		String str="jdghsga#$%#$%$%&$jHJKHKH*&&&**&";
		String clear=str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(clear);
	}
}
