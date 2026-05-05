package Programs;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String ");
		String str=sc.nextLine();
		String result="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch!=' ')		
			{
				result=result+ch;
			}
		}
		System.out.println(result);
				
	}
}
