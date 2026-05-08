package Programs;

import java.util.HashMap;
import java.util.Map;

public class OccurenceOfString {

	public static void main(String[] args) {
		
		String str="hello this is is java java for automation engineer is";
		String []sp=str.split(" ");
		Map<String,Integer>map=new HashMap<>();
		
		for(int i=0;i<sp.length;i++)
		{
			if(map.containsKey(sp[i]))
			{
				int count=map.get(sp[i]);
				map.put(sp[i], count+1);
				
			}else {
				map.put(sp[i], 1);
			}
		}
		
		System.out.println(map);
		
		
	} 
	
}
