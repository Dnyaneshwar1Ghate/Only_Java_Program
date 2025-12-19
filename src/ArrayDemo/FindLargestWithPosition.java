package ArrayDemo;

public class FindLargestWithPosition {

	public static void main(String[] args) {
		
		int arr[]= {45,65,987,654,500000};
		
		int position=0;
		
		int maxNumber=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>maxNumber)
			{
				maxNumber=arr[i];
				position=i;
			}
		}
		System.out.println(maxNumber+" with "+position+" th position");
	}
}
