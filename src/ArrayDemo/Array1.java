package ArrayDemo;

public class Array1 {
	
	public static void main(String[] args) {
		
		int arr[]= {52,60,12,45,36,89,77};
		
		int min=arr[0];
		int max=arr[0];
		
		for(int arry:arr)
		{
			if(arry>max)
			{
				max=arry;
			}
			if(arry<min)
			{
				min=arry;
			}
		}
		
		System.out.println(max);
		System.out.println(min);
	}
	
	

}
