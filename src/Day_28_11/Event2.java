package Day_28_11;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Event2 {

	public static void main(String[] args) {
		
		int arr[]= {2,4,3,5,6,7,8,9,33,44,55,23,100,200,330};
		
		List<Integer>list=new LinkedList<>();
		
		for(int num:arr)
		{
			list.add(num);
		}
		Collections.sort(list);
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)%2==0)
			{
				System.out.print(" "+list.get(i));
			}
		}
	}
}
