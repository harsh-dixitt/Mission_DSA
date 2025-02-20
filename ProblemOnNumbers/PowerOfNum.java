package com.tuf;

public class PowerOfNum {

	public static void main(String[] args) {
		int num = 11;
		int pow = 3;
		int res = 1;
		for (int i = 1; i <= pow; i++) {
			if (pow == 0 || num == 0 || num == 1)
			{
				break;
			}
			res *= num;
		}
		System.out.println(res);
	}
}
