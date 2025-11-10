package CollectionDemo;

import java.util.HashMap;

public class OcurenceOFWord {
	
	public static void main(String[] args) {
		String string="hello programing this hello is this is is is java java programing";
		String str[]=string.split(" ");
		HashMap<String,Integer>map=new HashMap<>();
		
		for(int i=0;i<str.length;i++)
		{
			if(map.containsKey(str[i]))
			{
				int count =map.get(str[i]);
				
				map.put(str[i], count +1);
				
			}else {
				map.put(str[i], 1);
			}
		}
		System.out.println(map);
	}

}
