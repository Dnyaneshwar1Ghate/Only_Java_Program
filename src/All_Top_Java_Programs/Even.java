package All_Top_Java_Programs;

public class Even {

	public static boolean isEvenOrOdd(int num) {
		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		int num = 11;
		if (isEvenOrOdd(num)) {
			System.out.println("Eeven");
		} else {
			System.out.println("Odd");
		}
	}
}
