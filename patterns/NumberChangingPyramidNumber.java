package com.patterns;
//1 
//2 3 
//3 4 5 
//4 5 6 7 
//5 6 7 8 9 
//6 7 8 9 10 11 
public class NumberChangingPyramidNumber {

	static void printPattern(int n) {
		int k = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j+k +" ");
			}
			k++;
			System.out.println();
		}
	}

	public static void main(String args[]) {
		int n = 6;
		printPattern(n);
	}
}
