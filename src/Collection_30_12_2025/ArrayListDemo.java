package Collection_30_12_2025;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<String>list=new ArrayList<>();
		list.add("hello");
		list.add("java");
		list.add("collections");
		list.add("programs");
		
		System.out.println("--------------Simple SOP method--------------");

		System.out.println(list);
		System.out.println("--------------Using For Loop--------------");
		for(String lt:list)
		{
			System.out.println(lt);
		}
		
		
		
		list.remove(0);
		Iterator<String>itr=list.iterator();
		System.out.println("--------------Using ITerator--------------");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
	
	
}
