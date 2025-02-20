package com.tuf;

public class Factors {
	static void Divisor(int n) {
		for (int i = 1; i <= n; i++)
			if (n % i == 0)
				System.out.print(i + " ");
	}
	public static void main(String args[]) {
		int n = 6;
		System.out.print("Factors of " + n + " are: ");
		Divisor(n);
	}
}
