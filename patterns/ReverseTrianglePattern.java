//1 2 3 4 5 6 
// 2 3 4 5 6 
//  3 4 5 6 
//   4 5 6 
//    5 6 
//     6 
package com.patterns;

public class ReverseTrianglePattern {
	static void printpattern(int n) {
		int x = 0;
		for (int i = n; i >= 1; i--) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 1 + x; k <= n; k++) {
				System.out.print(k + " ");
			}
			x++;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 6;
		printpattern(n);
	}
}
