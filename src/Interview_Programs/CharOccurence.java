package Interview_Programs;

import java.util.HashMap;
import java.util.Map;

public class CharOccurence {

	public static void main(String[] args) {
		
		String sp="Java Automation";
		
		Map<Character,Integer>map=new HashMap<>();
		for(int i=0;i<sp.length();i++)
		{
			char ch=sp.charAt(i);
			if(map.containsKey(ch))
			{
				int count=map.get(ch);
				map.put(ch,count+1);
			}else
			{
				map.put(ch,1);
			}
		}
		System.out.println(map);
		
		
	}
}
