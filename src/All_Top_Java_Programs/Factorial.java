package All_Top_Java_Programs;

public class Factorial {

	public static void fact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
			
		}
		System.out.print(fact+" ");
	}
	public static void main(String[] args) {
		fact(5);
	}
}
