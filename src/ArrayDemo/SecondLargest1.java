package ArrayDemo;

public class SecondLargest1 {

	public static void main(String[] args) {
		
		int arr[]= {4,2,3};
		int large=arr[0];
		int slarge=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				large=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++)
			
		{
			if(arr[i]!=large&&arr[i]>slarge)
			{
				slarge=arr[i];
				
			}
			
		}
		
		System.out.println(slarge);
	}
}
