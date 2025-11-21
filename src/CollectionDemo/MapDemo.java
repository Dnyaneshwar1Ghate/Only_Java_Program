package CollectionDemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<Integer,String>map=new HashMap<>();
		map.put(1,"java");
		map.put(2,"C");
		map.put(3,"C++");
		map.put(4,"Python");
		map.put(5,"Rubi");
		
		System.out.println(map);
		
		for(Map.Entry<Integer, String>mp:map.entrySet())
		{
			int key=mp.getKey();
			String value=mp.getValue();
			System.out.println(key+"="+value);
		}
		
		
		
	}
}
