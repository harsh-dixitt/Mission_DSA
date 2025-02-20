package com.tuf;

public class PallindromeNumber {

	static boolean isPallindrome(int num) {
		int dup = num;
		int revNum = 0;
		while (num > 0) {
			int rem = num % 10;
			revNum = (revNum * 10) + rem;
			num = num / 10;
		}
		if (dup == revNum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int num = 12321;
		boolean ans = isPallindrome(num);
		if (ans == true)
			System.out.println(num + " is Pallindrome..");
		else
			System.out.println(num + " is not Pallindrome..");

	}

}
