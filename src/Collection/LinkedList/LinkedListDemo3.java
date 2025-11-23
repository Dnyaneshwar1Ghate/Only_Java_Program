package Collection.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo3 {
	
	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		
		l.add("Dog");
		l.add("cat");
		l.add("tiger");
		System.out.println(l);
		l.addFirst("lion");
		System.out.println(l);
		l.addLast("ox");
		System.out.println(l);
	}

}
