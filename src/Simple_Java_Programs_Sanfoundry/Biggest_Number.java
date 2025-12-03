package Simple_Java_Programs_Sanfoundry;

public class Biggest_Number {

	public static void main(String[] args) {
		
		int num1=150;
		int num2=60;
		int num3=440;
		if(num1>num2 && num1>num3)
		{
			System.out.println("num 1 is largest");
		}else if(num2>num1 &&num2>num3)
		{
			System.out.println("num 2 is larget");
		}else {
			System.out.println("num 3 is largest");
		}
	}
}
