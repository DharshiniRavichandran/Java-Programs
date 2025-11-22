package Recursion;

public class Palindrome {

	public static boolean function(String s, int i) {

		int len = s.length();
		if (i >= len / 2) {
			return true;
		}
		if (s.charAt(i) != s.charAt(len - i - 1)) {
			return false;
		}
		return function(s, i + 1);
	}

	public static void main(String[] args) {

		String s = "GERGEG";
		System.out.println(function(s, 1));
	}

}

//TimeComplecity O(n/2)
