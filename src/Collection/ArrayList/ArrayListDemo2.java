package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		
		ArrayList al=new ArrayList<>();
		al.add("x");
		al.add("y");
		al.add("z");
		al.add("a");
		System.out.println(al);
		ArrayList al1=new ArrayList<>();
		al1.addAll(al);
		System.out.println(al1);
		al1.removeAll(al);
		System.out.println(al1);
		
		//collections class method
		//Collecition.sort()s
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println(al);
	}

}
