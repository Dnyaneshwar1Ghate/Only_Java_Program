package Date_11_02_2026;

public class Test {

	static {
		System.out.print("A");
	}
	static {
		System.out.print("B");
	}
	{
		System.out.print("C");
	}
	{
		System.out.print("D");
	}
	public Test()
	{
		System.out.print("E");
	}
	public static void main(String[] args) {
		
		new Test();
		new Test();
	}
}
