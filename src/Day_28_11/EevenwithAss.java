package Day_28_11;

import java.util.Arrays;

public class EevenwithAss {
	
	public static void main(String[] args) {
		int arr[]= {3,5,6,4,3,2,3,4,56,6,7,8};
		
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(" "+arr[i]);
			}
		}
	}

}
