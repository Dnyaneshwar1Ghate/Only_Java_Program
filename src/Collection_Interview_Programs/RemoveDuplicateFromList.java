package Collection_Interview_Programs;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromList {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>(Arrays.asList(1, 5, 2, 4, 1, 2, 3, 6, 4, 7, 8, 9, 8));

		Set<Integer> set = new LinkedHashSet<>(list);

		System.out.println(set);

	}
}
