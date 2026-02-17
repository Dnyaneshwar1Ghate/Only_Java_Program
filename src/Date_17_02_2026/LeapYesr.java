package Date_17_02_2026;

public class LeapYesr {

	public static void main(String[] args) {

		int year = 2028;
		if (year % 4 == 0 && year%100!=0 || year % 400 == 0) {
				System.out.println("leap Year");
		}else {
			System.out.println("not leap year");
		}
		}
	
}
