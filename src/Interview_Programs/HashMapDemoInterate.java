package Interview_Programs;

import java.util.*;

public class HashMapDemoInterate {

	public static void main(String[] args) {
		
		Map<Integer,String>map=new HashMap<>();
		
		map.put(1, "java");
		map.put(2, "C");
		map.put(3, "CPP");
		map.put(4, "rubi");
		map.put(5, "python");
		map.put(6, "C#");
		System.out.println(map);
		
		for(Map.Entry<Integer,String>it:map.entrySet())
		{
			int key=it.getKey();
			String value=it.getValue();
			System.out.println(key+" : "+value +" ");
		}
	
		
		
	}
}
