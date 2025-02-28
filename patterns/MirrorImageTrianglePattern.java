//1 2 3 4 5 6 
// 2 3 4 5 6 
//  3 4 5 6 
//   4 5 6 
//    5 6 
//     6 
//    5 6 
//   4 5 6 
//  3 4 5 6 
// 2 3 4 5 6 
//1 2 3 4 5 6 
package com.patterns;

public class MirrorImageTrianglePattern {
	public static void printPattern(int n) {
		int i, j;
		// Printing the upper part
		for (i = 1; i <= n; i++) {
			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (j = i; j <= n; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

		// Printing the lower part
		for (i = n - 1; i >= 1; i--) {
			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		int n = 6;
		printPattern(n);
	}
}
