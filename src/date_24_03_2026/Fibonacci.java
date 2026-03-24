package date_24_03_2026;

public class Fibonacci {

	public static void main(String[] args) {
		
		int num=10;
		int num1=0;
		int num2=1;
		
		for(int i=0;i<num;i++)
		{
			System.out.println(num1+" ");
			int num3=num1+num2;
			
			num1=num2;
			num2=num3;
		}
	}
}
