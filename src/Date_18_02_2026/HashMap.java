package Date_18_02_2026;

import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap {

	public static void main(String[] args) {
		
		Map<Integer,String>map=new LinkedHashMap<>();
		map.put(1, "hello");
		map.put(2, "hello");
		map.put(3, "hello3");
		map.put(4, "hello4");
		System.out.println(map);
		for(Map.Entry<Integer, String>mp:map.entrySet())
		{
			System.out.println(mp.getKey()+"="+mp.getValue());
		}
		
		
		
		
	}
}
