package Date_16_02_2026;

import java.util.HashMap;
import java.util.Map;

public class CharOC {
public static void main(String[] args) {

	String str="hello";
	char[]ch=str.toCharArray();
	Map<Character,Integer>map=new HashMap<>();
	for(int i=0;i<ch.length;i++)
	{
		if(map.containsKey(ch[i]))
		{
			int count =map.get(ch[i]);
			map.put(ch[i], count+1);
			
		}else {
			map.put(ch[i], 1);
		}
	}
	System.out.println(map);
}
	
}
