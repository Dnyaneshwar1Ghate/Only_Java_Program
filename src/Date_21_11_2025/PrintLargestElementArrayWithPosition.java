package Date_21_11_2025;

public class PrintLargestElementArrayWithPosition {
	
	public static void main(String[] args) {
		
		int arr[]= {44445,65,872,9,5,65,88};
		int count=0;
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				count =i;
			}
			
		}
		System.out.println(max+ " is the larget Element in arrya with "+count+" position");
	}

}
