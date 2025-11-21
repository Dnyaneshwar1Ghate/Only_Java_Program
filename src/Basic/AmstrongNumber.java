package Basic;

public class AmstrongNumber {
	public static void main(String[] args) {

		int num = 1634;
		int a, b, c;
		int sum = 0;
		c = num;
		while (num > 0) {

			a=num%10; // 4  3 --6 
			b=num/10; // 1
			sum=sum+(a*a*a*a);// 256+81+1296+1
			
			num=b;  //1
		}
		if(sum==c)
		{
			System.out.println("amstrong");
		}else
		{
			System.out.println("not amstrong");
		}

	}
}
