package Recursion;

import java.util.ArrayList;

public class Subsequence {

	public static void function(int i, int n, int[] arr, ArrayList<Integer> arrlist) {

		if (i == n) {
			for (int a : arrlist) {
				System.out.print(a + " ");
			}
			if (arrlist.size() == 0) {
				System.out.print("{ }");
			}
			System.out.println();
			return;
		}
		arrlist.add(arr[i]);
		function(i + 1, n, arr, arrlist);
		arrlist.remove(arrlist.size() - 1);
		function(i + 1, n, arr, arrlist);

	}

	public static void main(String[] args) {

		int[] arr = { 3, 1, 2 };
		int n = arr.length;
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		function(0, n, arr, arrlist);

	}

}
