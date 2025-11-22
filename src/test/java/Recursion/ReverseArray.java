package Recursion;

public class ReverseArray {
	// Swapping using 2 pointers
	public static void function1(int arr[], int l, int r) {
		if (l >= r) {
			for (int a : arr) {
				System.out.print(a + " ");
			}
			return;
		}
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
		function1(arr, l + 1, r - 1);
	}

	//Swapping using single pointer
	public static void function2(int arr[], int i, int n) {
		if (i >= n/2) {
			for (int a : arr) {
				System.out.print(a + " ");
			}
			return;
		}
		int temp = arr[i];
		arr[i] = arr[n-i-1];
		arr[n-i-1] = temp;
		function2(arr, i+1, n);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		
		function2(arr, 0,n);
		System.out.println();
		function1(arr, 0,n-1);

	}

}
