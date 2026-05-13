package All_Top_Java_Programs;

public class Fibonacci {

	public static void main(String[] args) {

		int num = 8;
		int num1 = 0;
		int num2 = 1;

		for (int i = 0; i <= num; i++) {
			System.out.print(num1 + " ");
			int num3 = num2 + num1;

			num1 = num2;
			num2 = num3;

		}

	}
}
