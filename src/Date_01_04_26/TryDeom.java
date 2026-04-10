package Date_01_04_26;

public class TryDeom {
	public static void main(String args[]) {

		try {
			int num = 10 / 0;
		} 

		catch (Exception e) {
			System.out.println(e);

		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

}
