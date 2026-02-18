package Date_18_02_2026;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String> lst = new ArrayList<>();
		lst.add("helo");
		lst.add("helo1");
		lst.add("helo2");
		lst.add("helo3");
		System.out.println(lst);
		
		for(String l:lst)
		{
			System.out.println(l);
		}

		Iterator itr=lst.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
