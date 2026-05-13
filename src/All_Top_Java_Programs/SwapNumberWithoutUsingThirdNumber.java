package All_Top_Java_Programs;

public class SwapNumberWithoutUsingThirdNumber {

	
	
	public static void swapNumber(int num1,int num2)
	{
		
		
		System.out.println("Before Swap");
		System.out.println(num1+" "+num2);
		num2=num2+num1;
		num1=num2-num1;
		num2=num2-num1;
		System.out.println("Before Swap");
		System.out.println(num1+" "+num2);
	}
	public static void main(String[] args) {
		
		swapNumber(90, 100);		

	}
	
	
	
}
