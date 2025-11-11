package Interview_Programs;

public class Fibonacii {

	public static void main(String[] args) {

		int num = 10;
		
		int num1 = 0, num2 = 1;
	

		System.out.print(num1 + " " + num2 + " ");
		
		for (int i = 2; i < num; i++) {
			
			int next=num1+num2;
			System.out.print(next+" ");
			num1=num2;
			num2=next;	
			
			

		}
	

	}

}
