//     * 
//    * * 
//   * * * 
//  * * * * 
// * * * * * 
//* * * * * * 

package com.patterns;

public class TriangleStarPattern {

	static void printpattern(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n = 6;
		printpattern(n);
	}
}
