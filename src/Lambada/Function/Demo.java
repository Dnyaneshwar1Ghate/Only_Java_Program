package Lambada.Function;

import java.util.function.Function;

public class Demo {

	// apply method is imp for Function interface

	public static void main(String[] args) {

		Function<Integer, Integer> f = n -> (n *n*n);

		System.out.println(f.apply(8));

		System.out.println(f.apply(2));

		System.out.println(f.apply(9));
		
		
		//String length
		
		///String -->length  -- int 
		
		Function<String,Integer>f1=n->(n.length());
		System.out.println(f1.apply("ghate"));
		System.out.println(f1.apply("Dnyaneshwar"));

		
		
	}

}
