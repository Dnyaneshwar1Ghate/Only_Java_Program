package Collection_Interview_Programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Find_Frequency_of_Ele {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("a", "b", "a", "c", "b", "a", "b", "c", "c");

		Map<String, Integer> map = new HashMap<>();

		for (String s : list) {

			map.put(s, map.getOrDefault(s, 0) + 1);
		}

		System.out.println(map);

	}

}
