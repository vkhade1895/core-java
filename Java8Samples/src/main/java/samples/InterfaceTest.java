package samples;

import samples.InterfaceTest.I1;

public class InterfaceTest {
	interface I1 {
		int calculate(int a);

		default double sqrt(int a) {
			return Math.sqrt(positive(a));
		}

		static int positive(int a) {
			return a > 0 ? a : 0;
		}
	}
}

class MyClass implements I1 {
	public static void main(String[] args) {
		System.out.println("This is a basic interface for testing.");
		System.out.println(
				"Here we are testing interface functionality for abstract , static and default methods in interface.");
		int positive = I1.positive(3);
		MyClass m = new MyClass();
		double sqrt = m.sqrt(16);
		m.calculate(positive);

	}

	@Override
	public int calculate(int a) {

		return a * a;
	}
}
