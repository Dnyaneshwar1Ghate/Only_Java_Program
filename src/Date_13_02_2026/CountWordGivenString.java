package Date_13_02_2026;

import java.util.HashMap;
import java.util.Map;

public class CountWordGivenString {

	public static void main(String[] args) {
		
		String str="i am learning java java java i am";
		String []sp=str.split(" ");
		Map<String,Integer>map=new HashMap<>();
		
		for(int i=0;i<sp.length;i++)
		{
			if(map.containsKey(sp[i]))
			{
				int count =map.get(sp[i]);
				map.put(sp[i], count+1);
			}
			else {
				map.put(sp[i],1);
			}
		}
		
		System.out.println(map);
		
	}
}
