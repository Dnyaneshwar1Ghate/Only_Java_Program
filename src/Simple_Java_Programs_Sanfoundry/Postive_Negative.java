package Simple_Java_Programs_Sanfoundry;

import java.util.Scanner;

public class Postive_Negative {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		int num;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println("number is positive");
		}else if(num<0)
		{
			System.out.println("number is negative");
		}else {
			System.out.println("number is not positive nither negative");
		}
		
	}

}
