package Date_10_02_2026;

import java.util.HashMap;
import java.util.Map;

public class Occerence {

	public static void main(String[] args) {

		String str="selenium automation";
		
		char []st=str.toCharArray();
		
		Map<Character,Integer>map=new HashMap<>();
		
		for(int i=0;i<st.length;i++)
		{
		
			if(map.containsKey(st[i]))
			{
				int count=map.get(st[i]);
				map.put(st[i],count+1);
				//map.put(st[i], map.get(st[i]) + 1);
			}
			else {
				map.put(st[i], 1);
			}
				
		}
		System.out.println(map);
		
		
	}
}
