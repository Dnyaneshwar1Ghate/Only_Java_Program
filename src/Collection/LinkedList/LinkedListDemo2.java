package Collection.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {
	
	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add("x");
		l.add("Y");
		l.add("z");
		 ;
		System.out.println(l);
		LinkedList l1=new LinkedList();
		
		//adding another linked list 
		l1.addAll(l);
		System.out.println(l1);
		
		//sorting
		Collections.sort(l1);
		System.out.println(l1);
		
		
		//reversr
		Collections.sort(l,Collections.reverseOrder());
		System.out.println();
		///////shufling
		Collections.shuffle(l);
		System.out.println(l);
		
	}

}
