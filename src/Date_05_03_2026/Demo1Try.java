package Date_05_03_2026;

public class Demo1Try {


	static int test()
	{
		try {
			return 2;
		}finally
		{
			return 1;
		}
		
	}
	public static void main(String[] args) {
		
		System.out.println(Demo1Try.test());
	}
}
