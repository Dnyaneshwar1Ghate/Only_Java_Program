package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		
		String arr[]= {"dog","cat","tiger"};
		
		for(String ar:arr)
		{
			System.out.println(ar);
		}
		
		ArrayList al=new ArrayList(Arrays.asList(arr));
		System.out.println(al);
	}
	

}
