package ArrayDemo;

public class RemoveZeroFromArry {

	public static void main(String[] args) {

		String str = "00011111000012340054258";

		char[] arr = str.toCharArray();

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {

			if (Character.getNumericValue(arr[i]) != 0) {
				sb.append(arr[i]);
			}
		}
		System.out.println(sb.toString());

	}

}
