package com.tuf;

public class PallindromeRange {

	static boolean isPalindrome(int n) {

		int reverse = 0;
		int temp = n;
		while (n > 0) {
			int rem = n % 10;
			reverse = reverse * 10 + rem;
			n = n / 10;
		}

		// If n and reverse are same,
		// then n is palindrome
		if (temp == reverse)
			return true;
		return false;
	}

	public static void main(String args[]) {
		int min = 100;
		int max = 150;
		for (int i = min; i <= max; i++) {
			if (isPalindrome(i)) {
				System.out.print(i + " ");
			}
		}

	}
}
