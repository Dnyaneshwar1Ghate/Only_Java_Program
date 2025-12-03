package Basic;

import java.util.Scanner;

public class AddEventOddDemo {
	
	public static void main(String[] args) {
		
		int num;
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int even=0;
		int odd=0;
		System.out.println("Enter a number in array :");
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<num;i++)
		{
			if(arr[i]%2==0)
			{
				even=even+arr[i];
			}
			else
			{
				odd=odd+arr[i];
			}
		}
		System.out.println("add of even number "+even);
		System.out.println("add of odd nuber"+ odd);
	}

}
