package Date_27_0_2026;

public class Largest {

	public static void main(String[] args) {
		
		int num[]= {10,45,800,300,80000,1,90000,300245};
		int max=num[0];
		int Maxcount=0;
		int min=num[0];
		int Mincount=0;
		
		for(int i=0;i<num.length;i++)
		{
			if(max<num[i])
			{
				max=num[i];
				 Maxcount=i;
			}
			if(min>num[i])
			{
				min=num[i];
				Mincount=i;
				
			}
		}
		
				
	
		System.out.println(max);
		System.out.println(Maxcount);

		System.out.println(min);
		System.out.println(Mincount);
	}
}
