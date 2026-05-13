package All_Top_Java_Programs;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
	
		int rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to reverse : ");
		int num=sc.nextInt();
		while(num>0)
		{
			rev=rev*10+num%10;
			num=num/10;
		
			
		}
		System.out.print(rev);
		
	}
}
