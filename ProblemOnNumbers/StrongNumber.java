package com.tuf;

public class StrongNumber {

	static boolean isStrong(int n) {
		int temp = n;
		int fact;
		int sum = 0;
		while (temp > 0) {
			int rem = temp % 10;
			fact = 1;
			for (int i = rem; i > 0; i--) {
				fact *= i;
			}
			sum += fact;

			temp /= 10;
		}
		System.out.println(sum);
		if (sum == n)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int n = 145;
		boolean res = isStrong(n);
		if (res == true)
			System.out.println("Strong");
		else
			System.out.println("Not Strong");
	}
}
