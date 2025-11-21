package Interview_Programs;

public class FibDemo {

	public static void main(String[] args) {
		
		int num=10;
		int num1=0,num2=1;
		System.out.println(num1+" "+num2);
		for(int i=2;i<num;i++)
		{
			int next=num1+num2;
			System.out.println(next+" ");
			num1=num2;
			num2=next;
		}
		
		
	}
}
