package ArrayDemo;

public class ArryEvenOd {

	public static void main(String[] args) {
		int arr[] = { 10, 250, 45, 16, 87, 32, 14 };

		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] % 2 == 0) {
				
				System.out.println(arr[i] + " :-is Even");
			} else {
				System.out.println(arr[i] + " :- is Odd");
			}
		}
	}
}
