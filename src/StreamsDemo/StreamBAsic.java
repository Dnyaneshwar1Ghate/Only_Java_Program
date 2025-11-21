package StreamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBAsic {
	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("java","python","c","c++");
		List<String> result=names.stream()
				.filter(name->name.startsWith("p"))
				.map(String::toUpperCase)
				.sorted()
				.collect(Collectors.toList());
		System.out.println(result);
	}

}
