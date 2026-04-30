package Date_30_04_2026;

import java.util.Scanner;

public class SumOFMultipleNumbers {

	public static void main(String[] args) {
		
		int count;
		int num;
		int sum=0;
		System.out.println("Enter Count of Numbers:");
		Scanner sc=new Scanner(System.in);
		count=sc.nextInt();
		System.out.println("You Eneterd :"+count);
		for(int i=0;i<count;i++)
		{
			num=sc.nextInt();
			sum=sum+num;
			
			
		}
		System.out.println("sum:"+sum);
	}
}
