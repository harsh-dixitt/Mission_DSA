// PASCALS/FLOYD TRIANGLE
//    1 
//   1 1 
//  1 2 1 
// 1 3 3 1 
package com.patterns;

public class PascalsTriangle {
	public static void printPascal(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {

				// for left spacing
				System.out.print(" ");
			}

			int num = 1;
			for (int k = 0; k <= i; k++) {
				System.out.print(num + " ");
				num = num * (i - k) / (k + 1);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 4;
		printPascal(n);
	}
}
