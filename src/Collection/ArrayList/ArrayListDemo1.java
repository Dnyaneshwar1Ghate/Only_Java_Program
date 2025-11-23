package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(1);
		al.add("ghate");
		al.add("pune");
		al.add(700000);

		System.out.println(al);
		System.out.println(al.size());

		al.remove(1);
		al.remove("pune");
		System.out.println(al);

		al.add(1, "Dnyaneshwar");
		System.out.println(al);
		al.add("Mumbai");
		System.out.println(al);
		
		System.out.println(al.get(2));
		
		al.set(1, "new");
		System.out.println(al);
		
		System.out.println(al.contains("new"));
		
		System.out.println(al.isEmpty());
		
		//read data using for loop
		
		for(int i=0;i<al.size();i++)
		{
				System.out.println(al.get(i)+" ");
		}
			
			
		//for each loop 
		for(Object e:al)
		{
			System.out.print(" "+e);
		}
	
		//iterator
		
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}
