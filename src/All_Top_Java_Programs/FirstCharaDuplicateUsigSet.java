package All_Top_Java_Programs;

import java.util.HashSet;

public class FirstCharaDuplicateUsigSet {

	public static void main(String[] args) {
		
		String str="Programming";
		HashSet<Character>set=new HashSet<>();
		char first='\0';
		for(char ch:str.toCharArray())
		{
			if(set.contains(ch))
			{
				first=ch;
				break;
				
			}else {
				set.add(ch);
			}
		}
		if(first!='\0')
		{
			System.out.println("fisrt duplicate char is :"+first);
		}else {
			System.out.println("not found");
		}
		
	}
}
