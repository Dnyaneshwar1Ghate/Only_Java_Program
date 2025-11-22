package Lambada.Predicate;

import java.util.function.Predicate;

//join predicate

//p1 --check number is even
//p2 --num grether than 50 or not

public class Demo3 {
	public static void main(String[] args) {

		int arr[] = { 50, 45, 65, 98, 78, 1, 35, 65, 26, 45 };
		Predicate<Integer> even = n -> (n % 2 == 0);
		Predicate<Integer> greter = n -> (n >50);

		/* (int e : arr) {
			if (even.test(e) && greter.test(e)) {
				System.out.println(e);
			}
		}*/
		for(int n:arr)
		{
			if(even.and(greter).test(n))
			{
				System.out.println(n);
			}
		}

	}

}
