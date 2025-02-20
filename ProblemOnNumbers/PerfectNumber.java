package com.tuf;

public class PerfectNumber {
	static boolean isPerfect(int num) {
		int sum = 0;
		int prod = 1;
		int temp1 = num;
		while (temp1 > 0) {
			int rem = temp1 % 10;
			sum = sum + rem;
			temp1 = temp1 / 10;
		}
		while (num > 0) {
			int rem = num % 10;
			prod = prod * rem;
			num = num / 10;
		}
//		System.out.println(sum +" "+prod);

		if (prod == sum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int num = 123;
		boolean ans = isPerfect(num);
		if (ans == true)
			System.out.println(num + " is Perfect Number.");
		else
			System.out.println(num + " is Not Perfect Number.");
	}
}
