package Programs;

import java.util.HashMap;
import java.util.Map;

public class OccurenceChar {

	public static void main(String[] args) {
		
		String str="Hello";
		Map<Character,Integer>map=new HashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(map.containsKey(ch))
			{
				int count =map.get(ch);
				map.put(ch, count+1);
				
			}else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		
	}
}
