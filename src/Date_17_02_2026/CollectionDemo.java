package Date_17_02_2026;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {

		// ArrayList
		List<String> frutes = new ArrayList<>();

		frutes.add("Apple");
		frutes.add("Banana");
		frutes.add("Mango");
		frutes.add("Apple");

		System.out.println(frutes);
		System.out.println("------------------------------");
		for (String frut : frutes) {
			System.out.println(frut);
		}
		System.out.println("------------------------------");
		// HashSet
		Set<String> set = new LinkedHashSet<>(frutes);
		for (String fr : set) {
			System.out.println(fr);
		}

		System.out.println("------------------------------");

		// HashMap
		Map<String, Integer> map = new HashMap<>();
		map.put("Mango", 3);
		map.put("Apple", 4);
		map.put("Orange", 5);
		System.out.println(map);

		for(Map.Entry<String, Integer>mp:map.entrySet())
		{
			System.out.println("Fruit :-"+mp.getKey()+" Count: "+mp.getValue());
			//String fruit=mp.getKey();
			//Integer count=mp.getValue();
			
			//System.out.println(fruit+" "+count);
		}
		
	}
}
