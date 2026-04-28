package Date_28_04_2026;

public class Demo {

	public static void main(String[] args) {
		A obj=new B();
		obj.show();
	}

}

class A {
	public void show() {
		System.out.println("A");
	}
}
class B extends A
{
	public void show(int x)
	{
		System.out.println("B");
	}
}