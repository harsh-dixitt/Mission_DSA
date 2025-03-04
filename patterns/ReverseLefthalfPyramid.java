package com.patterns;

public class ReverseLefthalfPyramid {
	public static void printPattern(int n) {
		int i, j;

		int num = 2 * n - 2;

		for (i = n; i > 0; i--) {
			for (j = 0; j < n - i; j++) {
				System.out.print(" ");
			}
			num = num - 2;
			for (j = 0; j < i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

	// Driver Function
	public static void main(String args[]) {
		int n = 6;
		printPattern(n);
	}
}
