package Simple_Java_Programs_Sanfoundry;

import java.util.Scanner;

public class Equal_Integer {

	public static void main(String[] args) {
		
		int n1,n2;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a two number ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		if(n1==n2)
		{
			System.out.println("numbers are equal ");
		}else
		{
			System.out.println("numbers are not equal");
		}
		
		
	}
}
