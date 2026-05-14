package All_Top_Java_Programs;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		String str="tautomation";
		char duplcate='\0';
		Set<Character>set=new HashSet<>();
		
		for(char ch:str.toCharArray())
		{
			if(set.contains(ch))
			{
				duplcate=ch;
				break;
				
			}else {
				
				set.add(ch);
			}
		}
		System.out.println(duplcate);
		
	}
}
