package Date_11_02_2026;

import java.util.HashSet;
import java.util.Set;

public class RemoveString {

	public static void main(String[] args) {
		
		String str="helo helo helo hello this is java java program";
		Set<String>set=new HashSet<>();
		String []words=str.split(" ");
		
		for(String word:words)
		{
			set.add(word);
			
		}
		System.out.println("oroginal String"+str);
		for(String word:set)
		{
			System.out.print(word+" ");
		}
		
		
		
	}
}
