package Interview_Programs;

public class SecondLargest {
	
	public static void main(String[] args) {
		
		int arr[]= {45,65,85,96,74,54};
		
		int larg=arr[0];
		int second=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(larg<arr[i])
			{
				larg=arr[i];
				
			}
		}
		for(int j=0;j<arr.length;j++)
		{
			if(second<arr[j]&& larg>arr[j])
			{
				second=arr[j];
			}
		}
		System.out.println(second);
		
	}

}
