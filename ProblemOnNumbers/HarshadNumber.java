package com.tuf;

public class HarshadNumber {

	static boolean isHarshad(int num) {
		int temp = num;
		int sum = 0;
		while (temp > 0) {
			int rem = temp % 10;
			sum += rem;
			temp = temp / 10;
		}
		if (num % sum == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int num = 378;
		boolean res = isHarshad(num);
		if (res == true)
			System.out.println(num + " is Harshad Number...");
		else
			System.out.println(num + " is not Harshad Number...");
	}
}
