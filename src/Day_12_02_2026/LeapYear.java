package Day_12_02_2026;

public class LeapYear {

	public static void main(String[] args) {
		
		int year=2028;
		if(year%4==0&&year%100!=0||year%400==0)
		{
			System.out.println("leap");
		}else {
			System.out.println("not leap");
		}
	}
}
