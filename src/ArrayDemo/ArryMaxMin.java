package ArrayDemo;

public class ArryMaxMin {
	public static void main(String[] args) {
		
		int arr[]= {40,50,320,655,100,203};
		int max=arr[0];
		int min=arr[0];
		
		for(int ary:arr)
		{
			if(ary>max)
			{
				max=ary;
			}
			if(ary<min)
			{
				min=ary;
			}
		}
		System.out.println(min);
		System.out.println(max);
		
	}

}
