package com.patterns;
//*******
//*******
//*******
//*******
//*******
//*******
//*******
public class SquareFillPattern {

	// Function to demonstrate pattern
	public static void printPattern(int n) {

		// outer loop to handle rows
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String args[]) {
		int n = 6;
		printPattern(n);
	}
}
