package Recursion;

public class PrintName {

	public static void function1(int i, int n) {
		if (i > n) {
			return;
		}
		function1(i + 1, 3);
		System.out.println(i + " Dharshini");
	}

	// Backtracking to print 3 to 1
	public static void function2(int i, int n) {
		if (i > n) {
			return;
		}
		System.out.println(i + " Dharshini");
		function2(i + 1, 3);

	}

	// Decreasing i values to print 3 to 1
	public static void function3(int i, int n) {
		if (i < n) {
			return;
		}
		System.out.println(i + " Dharshini");
		function3(i - 1, 1);

	}

	public static String function4(String name, int i) {

		if (i == name.length()) {
			return "";
		}
		return function4(name, i + 1) + name.charAt(i);

	}

	public static void main(String[] args) {
		function1(1, 3);
		System.out.println();
		function2(1, 3);
		System.out.println();
		function3(3, 1);
		System.out.println();
		System.out.println(function4("Dharshini", 0));

	}
}

//Timecomplexity & Spacecomplexity-O(n)