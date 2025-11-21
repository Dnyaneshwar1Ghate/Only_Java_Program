package Interview_Programs;

public class LeapYear {
	
	public static void main(String[] args) {
		
		int year=2020;
		if(year%4==0 && year%100!=0 ||year%400==0)
		{
			System.out.println(year+" year is leap years");
		}else {
			System.out.println(year+" year is not leap year");
		}
	}

}
