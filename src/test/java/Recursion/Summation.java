package Recursion;

public class Summation {

	public static void function1(int i, int sum) {
		if (i < 1) {
			System.out.println("Sum: " + sum);
			return;
		}
		function1(i - 1, sum + i);
	}

	public static int function2(int n) {
		if (n == 0) {
			return 0;
		}
		return n + function2(n - 1);
	}

	public static void main(String[] args) {

		function1(4, 0); // two parameter
		System.out.println("Sum: " + function2(3)); // Only one parameter

	}

}
