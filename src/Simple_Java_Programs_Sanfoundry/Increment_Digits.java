package Simple_Java_Programs_Sanfoundry;

public class Increment_Digits {
	
	public static void main(String[] args) {
		
		int num=56187;
		int m=0,a;
		
		while(num>0)
		{
			a=num%10;
			a++;
			m=m*10+a;
			num=num/10;
			
		}
		num=m;
		m=0;
		while(num>0)
		{
			a=num%10;
			m=m*10+a;
			num=num/10;
		}
	System.out.println(m);
		
	}

}
