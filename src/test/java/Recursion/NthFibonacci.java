package Recursion;

public class NthFibonacci {

	// To find nth fibonacci number using multiple recursive functions
	public static int function1(int n) {
		if (n <= 1) {
			return n;
		}
		return function1(n - 1) + function1(n - 2);
	}

	// To find nth finbonacci number using for loop
	public static int function2(int n) {
		int n0 = 0;
		int n1 = 1;
		int n2 = 0;
		System.out.print(n1 + " " + n2 + " ");
		for (int i = 2; i <= n; i++) {
			n2 = n0 + n1;
			System.out.print(n2 + " ");
			n0 = n1;
			n1 = n2;
		}
        System.out.println();
		return n2;

	}

	public static void main(String[] args) {

		System.out.println(function1(4));
		System.out.println(function2(6));

	}

}
