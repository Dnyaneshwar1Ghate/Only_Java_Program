package Set.HashSet;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(2);
		hs.add(4);
		hs.add(6);
		System.out.println("HashSet :" + hs);

		HashSet<Integer> num = new HashSet<>();
		num.addAll(hs);
		num.add(8);

		System.out.println("New hashSet :" + num);

		// remove all
		num.removeAll(hs);
		System.out.println(num);

	}
}
