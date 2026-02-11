package Date_11_02_2026;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		
		String str="hello hello this is is is java programs";
		Set<String>set=new LinkedHashSet<>();
		String words[]=str.split(" ");
		for(String word:words)
		{
			set.add(word);
		}
		System.out.println(str);
		for(String word:set)
		{
			System.out.print(word+" ");
		}
		
		
	}
}
