package date_04_03_2026;

public class RevstrigAsItIs {

	public static void main(String[] args) {

		String str = "Hello Java";
		String sp[] = str.split(" ");

		String rev = "";

		for (int i = 0; i <sp.length; i++) {
			String temp = sp[i];
			String innerRev = "";
			for (int j = temp.length() - 1; j >= 0; j--) {
				innerRev = innerRev + temp.charAt(j);
			}
			rev = rev + " " + innerRev;
		}

		System.out.println(rev);
	}
}
