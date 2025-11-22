package Recursion;

public class Factorial {

	public static void function1(int i, int fact) {
		if (i < 1) {
			System.out.println("factorial: " + fact);
			return;
		}
		function1(i - 1, fact* i);
	}

	public static int function2(int n) {
		if (n == 1) {
			return 1;
		}
		return n * function2(n - 1);
	}

	public static void main(String[] args) {

		function1(4, 1); // two parameter
		System.out.println("Factorial: " + function2(3)); // Only one parameter

	}


}
