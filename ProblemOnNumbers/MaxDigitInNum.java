package com.tuf;

public class MaxDigitInNum {

	public static void main(String[] args) {
		int num = 137195;
		int max = 0;
		while (num > 0) {
			int rem = num % 10;
			if (max < rem)
				max = rem;
			num /= 10;
		}
		System.out.println(max);
	}
}
