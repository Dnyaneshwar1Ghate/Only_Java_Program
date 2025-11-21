package CollectionDemo;

import java.util.HashMap;
import java.util.Map;

public class MApDemo1 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "java");
		map.put(2, "c");
		map.put(3, "cpp");
		map.put(4, "python");
		
		for(Map.Entry<Integer, String> sp:map.entrySet())
		{
			int key=sp.getKey();
			String value=sp.getValue();
			
			System.out.println(key +":"+ value);
		}
		

	}
}
