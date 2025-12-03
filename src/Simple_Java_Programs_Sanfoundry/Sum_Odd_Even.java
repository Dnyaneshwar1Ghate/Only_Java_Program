package Simple_Java_Programs_Sanfoundry;

import java.util.Scanner;

public class Sum_Odd_Even {

	public static void main(String[] args) {

		System.out.println("Enter a number:- ");
		int num;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		int arr[] = new int[num];
		System.out.println("enter a number in array");
		int sumE = 0, sumO = 0;
		for (int i = 0; i < num; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < num; i++) {
			if (arr[i] % 2 == 0) {
				sumE = sumE + arr[i];
			} else {
				sumO = sumO + arr[i];
			}

		}
		System.out.println("addition if Even Number is "+sumE);
		System.out.println("addition if Odd Number is "+sumO);
		

	}

}
