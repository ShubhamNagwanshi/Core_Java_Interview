package practice;

public class MethodOverloading {

	public int sum(int a, int b) {
		return a + b;

	}

	public int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();

		System.out.println(m.sum(20, 10));
		System.out.println(m.sum(20, 10, 5));

	}
}