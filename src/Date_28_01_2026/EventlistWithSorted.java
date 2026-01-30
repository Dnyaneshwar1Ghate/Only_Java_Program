package Date_28_01_2026;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EventlistWithSorted {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 5, 6, 8, 7, 9, 6, 6, 3, 5, 4, 8, 8 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {

			if(arr[i]%2==0)
			{
				System.out.print(" "+arr[i]);				
			}
			
		}
	
		
		
		

	}
}
