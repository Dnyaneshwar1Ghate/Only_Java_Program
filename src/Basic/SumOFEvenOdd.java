package Basic;

import java.util.Scanner;

public class SumOFEvenOdd {

	public static void main(String[] args) {

		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int even = 0, odd = 0;
		int arr[] = new int[num];
		System.out.println("enter a number in array");

		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();

		}
		for(int i=0;i<num;i++)
		{
			if(arr[i]%2==0)
			{
				even=even+arr[i];
			}else {
				odd=odd+arr[i];
			}
		}
		System.out.println("addition of even : "+even);
		System.out.println("addition of odd : "+odd);
	}
}
