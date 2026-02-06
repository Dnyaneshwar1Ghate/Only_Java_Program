package AllProgram;

public class Fibonacci {
	public static void main(String[] args) {
		
		int num=5;
		int num1=0;
		int num2=1;
		while(num>0)
		{
			System.out.println(num1+" ");
			int num3=num1+num2;
			num1=num2;
			num2=num3;
			num--;
		}
	}

}
