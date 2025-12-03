package Simple_Java_Programs_Sanfoundry;

import java.util.Scanner;

public class Check_Divisiblity {

	public static void main(String[] args) {
		
		int num;
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		num=sc.nextInt();
		if(num%5==0)
		{
			System.out.println("divisible by 5 ");
		}else
		{
			System.out.println("not divisible by 5");
		}
	}
}
