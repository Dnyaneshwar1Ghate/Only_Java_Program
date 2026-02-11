package Date_11_02_2026;

import java.util.HashMap;
import java.util.Map;

public class Occurence {

	public static void main(String[] args) {

		String str = "Automation";
		char []ch=str.toCharArray();
		Map<Character,Integer>map=new HashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
			
			if(map.containsKey(ch[i]))
			{
				int count=map.get(ch[i]);
				map.put(ch[i], count+1);
			}else {
				map.put(ch[i], 1);
			}
			
			
			
		}
		System.out.println(map);
		
		
		
	}
}
