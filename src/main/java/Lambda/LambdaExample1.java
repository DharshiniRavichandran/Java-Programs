package Lambda;

@FunctionalInterface
interface CalculatorA {
	int sum(int a, int b);
}
@FunctionalInterface
interface CalculatorB {
	int sum(int a, int b);
}

public class LambdaExample1 {

	public static void main(String[] args) {

		/***** Anonymous inner class *****/
		CalculatorA objA = new CalculatorA() {
			@Override
			public int sum(int a, int b) {
				int c = a + b;
				return c;
			}
		};
		int result1 = objA.sum(4, 9);
		System.out.println("AbstactAnonymousInnerClass:" + result1);

		/***** Lambda Expression ******/
		CalculatorB objB = (int a, int b) -> a + b;
		int result2 = objA.sum(4, 9);
		System.out.println("Lamba Expression:" + result2);
	}

}
