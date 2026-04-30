package Date_30_04_2026;

import java.util.Scanner;

public class CalculateSumOFMultipleNumbers {

	public static void main(String[] args) {

		int count;
		System.out.println("enter count of number");
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		System.out.println("You eneteres "+count);
		int numbers;
		int sum = 0;
		for (int i = 0; i < count; i++) {
			numbers = sc.nextInt();
			sum = sum + numbers;
		}
		System.out.println("sum of all numbers :" +sum);
	}
}
