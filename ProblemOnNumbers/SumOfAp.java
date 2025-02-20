package com.tuf;

public class SumOfAp {
	public static void main(String[] args) {
		int n = 7;
		int diff = 3;
		int sum = 0;
		for (int i = 1; i <= n; i=i+diff) {
			sum += i;
		}
		System.out.println("Sum of AP: " + sum);
	}
}
