package Basic;

public class FindTargetandwithCount {

	public static void main(String[] args) {

		int num[]= {40,56,98,54,748,56,54,8,79,5};
		int max=num[0];
		int min=num[0];
		int position=0;
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>max)
			{
				max=num[i];
				position=i;
			}
			
		}
		
		System.out.println(max +" number is found at "+position);
		
		position=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<min)
			{
				min=num[i];
				position=i;
			}
		}
		System.out.println(min +" number is found at "+position);
	}
}
