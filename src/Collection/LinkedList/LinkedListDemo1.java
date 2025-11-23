package Collection.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.add(100);
		ll.add("dghate");
		ll.add('A');
		ll.add(true);

		System.out.println(ll);
		// remove element
		ll.remove(2);
		System.out.println(ll);

		// insert element

		ll.add(2, "hello");
		System.out.println(ll);

		// get elemen using index
		System.out.println(ll.get(1));

		// change value
		ll.set(2, "Dnyaneshwar");
		System.out.println(ll);

		// contains
		System.out.println(ll.contains("dghate"));

		// isempty
		System.out.println(ll.isEmpty());

		// reading object or element from using for loop

		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}

		// for each loop
		for (Object e : ll) {
			System.out.println(e);

		}
		
		Iterator itr=ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
