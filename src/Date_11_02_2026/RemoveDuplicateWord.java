package Date_11_02_2026;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		String str="hello hello hello this is is is java java";
		Set<String>set=new HashSet<>();
		String[]words=str.split(" ");
		
		for(String word:words)
		{
			set.add(word);
		}
		System.out.println("original String : "+str);
		
		for(String word:set)
		{
			System.out.print(word+" ");
		}
		
	}
	
	
	
}
