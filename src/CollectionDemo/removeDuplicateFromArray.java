package CollectionDemo;

import java.util.HashMap;

import java.util.Set;

public class removeDuplicateFromArray {

	public static void main(String[] args) {
		int arr[] = { 10, 43, 23, 10, 3, 5, 3, 2, 10 };
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					int count = map.get(arr[i]);
					map.put(arr[i], count + 1);
				} else {
					map.put(arr[i], 1);
				}
			}
		}
		System.out.println(map);
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
	}
}
