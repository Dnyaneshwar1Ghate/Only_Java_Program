package Date_13_02_2026;

import java.util.LinkedHashSet;
import java.util.Set;

public class Removeduplicate {

	public static void main(String[] args) {
		String str="hello java java hello this is is java progrma";
		String []cp=str.split(" ");
		Set<String>set=new LinkedHashSet<>();
		for(String word:cp)
		{
			set.add(word);
		}
		for(String word:set)
		{
			System.out.print(" "+word);
		}
	}
}
