package Simple_Java_Programs_Sanfoundry;

import java.util.Scanner;

public class Odd_Even {
	public static void main(String[] args) {
		
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
	}
}
