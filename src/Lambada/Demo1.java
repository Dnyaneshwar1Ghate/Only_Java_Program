package Lambada;

import java.util.function.Predicate;

public class Demo1 {

	public static void main(String[] args) {
		
		Predicate<String> pre = s -> (s.length() < 4);
		System.out.println(pre.test("Nemejgjhgj"));
		Predicate<Integer>num=n->(n>10);
		System.out.println("this is number is gretes of 10 "+num.test(100));
		System.out.println(pre.test("thisi1"));
		
		String arr[]= {"heo","sksfsfsf","po","dsajkkf"};
		for(String name:arr)
		{
			if(pre.test(name))
			{
				System.out.println(name);
			}
		}
		
	}
}
