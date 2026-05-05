package Programs;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String ");
		String str=sc.nextLine();
		String afterRemoveSpace="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ')
			{
				afterRemoveSpace=afterRemoveSpace+ch;
			}
		}
		System.out.println(afterRemoveSpace);
		

	}
}
