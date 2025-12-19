package Basic;

public class Amst {

	public static void main(String[] args) {
		
		int num=153;
		int a,b;
		int sum=0;
		int ori=num;
		while(num>0)
		{
			a=num%10;
			b=num/10;
			sum=sum+(a*a*a); 
			num=b;
		}
		if(sum==ori)
		{
			System.out.println("Amstrong");
		}else
		{
			System.out.println("not amstrong");
		}
		
		
	}
}
