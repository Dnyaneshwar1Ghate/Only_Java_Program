package Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
	
	public static void main(String[] args) {
		
		

		HashSet s1=new HashSet(100);//inital capacity 100
		HashSet s=new HashSet();//16 default  0.75  ////load/ factor 75%
		s.add("bj");
		s.add("hello1");
		System.out.println(s);
		
		s.remove("bj");
		System.out.println(s);
		
		System.out.println(s.contains("hello"));
		
		
		System.out.println(s.isEmpty());
		
		
		for(Object e:s)
		{
			System.out.println(e);
		}
		
		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
		}
		
	}

}
