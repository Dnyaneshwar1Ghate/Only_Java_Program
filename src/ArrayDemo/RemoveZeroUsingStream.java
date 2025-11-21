package ArrayDemo;

import java.util.stream.Collectors;

public class RemoveZeroUsingStream {

public static void main(String[] args) {
	
	 String str = "00011111000012340054258";
	 
	 String result=str.chars().filter(c->c!='0')
			 .mapToObj(c -> String.valueOf((char)c))
			 .collect(Collectors.joining());
					 
				
	
			 
	 System.out.println(result);
			 
}
	
}
