package Day_30_01_2026;

public class MethodOverLoading {

	void display() {
		System.out.println("hello");

	}

	int add(int a, int b) {
		return a + b;
	}

	int add(int a, int b, int c) {
		return a + b + c;
	}

	double add(double a, double b) {
		return a + b;
	}

	float add(float a, float b) {
		return a + b;
	}

	public static void main(String[] args) {

		MethodOverLoading m1 = new MethodOverLoading();
		m1.display();
		System.out.println(m1.add(1, 2, 7));
		System.out.println(m1.add(1, 2));
		System.out.println(m1.add(1.6F, 2.5F));

		System.out.println(m1.add(10d,80d));

	}

}
