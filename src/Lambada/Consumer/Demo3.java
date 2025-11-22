package Lambada.Consumer;

import java.util.function.Consumer;

//consumer chaining 
public class Demo3 {
	public static void main(String[] args) {
		Consumer<String>c1=c->System.out.println(c+" "+"is white");
		Consumer<String>c2=c->System.out.println(c+" "+"is having four legs");
		Consumer<String>c3=c->System.out.println(c+" "+"is eating grass");
		
		c1.accept("cow");
		c2.accept("cow");
		c3.accept("cow");
		
		c1.andThen(c2).andThen(c3).accept("Dog");
		
		Consumer<String>c4=c1.andThen(c2).andThen(c3);
		c4.accept("Tiger");
	}

}
