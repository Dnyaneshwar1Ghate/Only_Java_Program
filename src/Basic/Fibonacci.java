package Basic;

public class Fibonacci {

	
	public static void main(String[] args) {
		
		int num=5;
		int num1=0;
		int num2=1;
		System.out.print(num1+" "+num2);
		for(int i=0;i<num;i++)
		{
			
		int num3=num1+num2;
		System.out.print(" "+num3+" ");
		num1=num2;
		num2=num3;
		
		}
	}
	
}
