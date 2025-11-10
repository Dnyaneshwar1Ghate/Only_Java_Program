package Java_Program_From_PAVAN;

public class Swap2NUmbers {
	
	public static void main(String[] args) {
		int a=10, b=20;
		System.out.println("before Swaping "+a+" "+b);
		
		//logic 1
		
		//int temp=a;
		//a=b;
		//b=temp;
		//System.out.println("after Swaping "+a+" "+b);
		
		//logic 2
		
		/*a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after Swaping "+a+" "+b);
		*/
		
		//logic3
	/*	a=a*b;
		b=a/b;
		a=a/b;
		System.out.println("after Swaping "+a+" "+b);
		*/
		b=a+b-(a=b);
		System.out.println("after Swaping "+a+" "+b);
		
		
	}

}
