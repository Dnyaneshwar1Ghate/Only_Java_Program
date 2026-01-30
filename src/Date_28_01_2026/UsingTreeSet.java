package Date_28_01_2026;

import java.util.Set;
import java.util.TreeSet;

public class UsingTreeSet {
	
	public static void main(String[] args) {
		
		int arr[]= {4,5,6,9,8,7,3,5,2,4,6,5,8,2};
		
		Set<Integer>tr=new TreeSet<>();
		for(int num:arr)
		{
			if(num%2==0)
			{
				tr.add(num);
				
			}
		}	
		for(int num:tr)
		{
			System.out.println(num);
		}
		
	}

}
