package Date_13_02_2026;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupli {

	public static void main(String[] args) {
		
		String str="new new new new java java java program";
		String sp[]=str.split(" ");
		Set<String>set=new LinkedHashSet<>();
		for(String word:sp)
		{
			set.add(word);
		}
		for(String word:set)
		{
			System.out.println(word);
		}
		
	}
}
