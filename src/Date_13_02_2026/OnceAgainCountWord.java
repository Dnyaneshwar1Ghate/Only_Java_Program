package Date_13_02_2026;

import java.util.HashMap;
import java.util.Map;

public class OnceAgainCountWord {

	public static void main(String[] args) {
		String str="hello hello this this is is java java programming";
		String sp[]=str.split(" ");
		Map<String,Integer>map=new HashMap<>();
		for(int i=0;i<sp.length;i++)
		{
			if(!map.containsKey(sp[i]))
			{
				map.put(sp[i], 1);
			}
			else{
				
				int count=map.get(sp[i]);
				map.put(sp[i],count+1);
			}
			
			
		}
		System.out.println(map);
		
	}
}
