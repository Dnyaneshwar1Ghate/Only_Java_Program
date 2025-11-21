package ArrayDemo;

public class SecondLargest {

	public static void main(String[] args) {

		int arr[] = { 54, 69, 8, 10, 23, 644, 78, 95 };
		
		int largest = arr[0];
		int secondLargest = arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(largest<arr[i])
			{
				largest=arr[i];
				
			}
		}
		for(int j=0;j<arr.length;j++)
		{
			if(secondLargest<arr[j]&&largest>arr[j])
			{
				secondLargest=arr[j];
			}
		}

		System.out.println(secondLargest);
		
	}
}
