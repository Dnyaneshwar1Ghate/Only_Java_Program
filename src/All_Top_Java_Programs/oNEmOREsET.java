package All_Top_Java_Programs;

import java.util.HashSet;
import java.util.Set;

public class oNEmOREsET {

	public static void main(String[] args) {
		
		String str="javaprogramming";
		char first='\0';
		Set<Character>set=new HashSet<>();
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
		System.out.println(first);
		
				
	}
}
