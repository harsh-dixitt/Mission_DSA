package com.tuf;

public class Factorial {
	static int fact(int num) {
		if (num == 0 || num == 1)
			return 1;
		int factorial = 1;
		for (int i = num; i > 0; i--) {
			factorial *= i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		int num = 0;
		int res = fact(num);
		System.out.println(res);
	}
}
