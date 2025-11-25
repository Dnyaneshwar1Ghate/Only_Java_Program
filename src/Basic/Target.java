package Basic;

import java.util.Scanner;

class Target {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int target=sc.nextInt();
		
		int num[]= {1,32,56,45,878,954,623,541,24,54,24,125,412,412,1,1,1,1,1,2,45,5,33,5};
		int count=0;

		System.out.println("total length of an arrya "+num.length);

		System.out.print("Given number found at : ");
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==target)
			{
				count ++;
				System.out.println(i + " ");
			}
		}
		
		if(count>0)
		{
			System.out.println("Total Count of number "+count);
		}else	
		{
			System.out.print("number not found in array");
		}
	}
}
