package Array;

import java.util.Scanner;

class TypesOfArray {
	Scanner sc = new Scanner(System.in);

	public void singleDimensional() {
		int arr[] = new int[5];// Declaration
		int arr1[] = { 1, 2, 3, 4, 5 };// Initialization
		for (int i = 0; i < 4; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
	}

	public void twoDimensional() {
		int arr3[][] = new int[2][3];// Declaration
		int arr4[][] = { { 1, 2, 3 }, { 2, 3, 4 } };// Initialization
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(arr4[i][j] + " ");
			}
			System.out.println();
		}
		// Printing Arrays using enhanced for loop
		for (int n[] : arr4) {
			for (int m : n) {
				System.out.print(m + " ");
			}
			System.out.println();
		}
	}

	public void threeDimensional() {
		int[][][] arr6 = new int[3][2][2];
		System.out.println("Enter array:");
		for (int i = 0; i < arr6.length; i++) {
			for (int j = 0; j < arr6[i].length; j++) {
				for (int k = 0; k < arr6[i][j].length; k++) {
					arr6[i][j][k] = sc.nextInt();
				}
				System.out.println();
			}
			System.out.println();
		}

		// Printing values in normal for loop
		System.out.println("Enter array:");
		for (int i = 0; i < arr6.length; i++) {
			for (int j = 0; j < arr6[i].length; j++) {
				for (int k = 0; k < arr6[i][j].length; k++) {
					System.out.print(arr6[i][j][k] + " ");
				}
				System.out.println(); // added to print each row on a new line
			}
			System.out.println(); // added to separate 2D arrays
		}

		// Printing Arrays using enhanced for loop
		for (int[][] block : arr6) {
			for (int[] row : block) {
				for (int element : row) {
					System.out.print(element + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

	public void jaggedArray() {
		// Jagged Array- Each row can have a different number of columns. Memory allocation is dynamic.
		int arr5[][] = new int[3][];
		arr5[0] = new int[2];
		arr5[1] = new int[3];
		arr5[2] = new int[4];

		System.out.println("Enter array:");
		for (int i = 0; i < arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				arr5[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		for (int i = 0; i < arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				System.out.print(arr5[i][j] + " ");
			}
			System.out.println();
		}
	}
}

public class Arrays {

	public static void main(String args[]) {

		TypesOfArray array = new TypesOfArray();
		array.twoDimensional();

	}
}