package ArrayDemo;

import java.util.Arrays;

public class LArgestInArray {

	public static void main(String[] args) {
		
		int[] num= {54,68,96,302,45,20};  //6  --5 
		int size=num.length;
		Arrays.sort(num);
		System.out.println("largest element in array "+num[size-2]);
		
		
				
		
	}
}
