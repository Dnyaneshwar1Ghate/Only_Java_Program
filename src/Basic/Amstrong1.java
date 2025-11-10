package Basic;

public class Amstrong1 {

	public static void main(String[] args) {
		
		int num=153;
		int a,b,c;
		int sum=0;
		int re=num;
		while(num>0)
		{
			a=num%10;
			b=num/10;
			sum=sum+(a*a*a);
			num=b;
		}
		if(sum==re)
		{
			System.out.println("amstrong");
		}else {
			System.out.println("not amstrong");
		}
	}
}
