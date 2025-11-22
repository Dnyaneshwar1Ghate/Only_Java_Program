package Lambada.Consumer;

import java.util.function.Consumer;

public class Demo1 {
	public static void main(String[] args) {
		//accept method
		
		Consumer<String>c=s->System.out.println(s);
		c.accept("helo");
		
	}

}
