package StringDemo;

import java.util.HashMap;

public class CharOccur {
	
	public static void main(String[] args) {
		
		String name="MADAM";
		
		HashMap<Character,Integer>map=new HashMap<>();
		
		for(int i=0;i<name.length();i++)
		{
			char str=name.charAt(i);
			if(map.containsKey(str))
			{
				int count =map.get(str);
				map.put(str, count+1);
				
				
			}else {
				map.put(str, 1);
			}
		}
		
		System.out.println(map);
	}

}
