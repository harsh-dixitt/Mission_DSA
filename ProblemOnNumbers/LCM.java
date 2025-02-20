package com.tuf;

public class LCM {
	public static void main(String args[]) {
		int a = 125, b = 400;
		int gcd = 1;
		for (int i = 1; i <= Math.min(a, b); i++) {
			if (a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		int lcm = (a * b) / gcd;
		System.out.print("The LCM of "+a +" and " +b+" is " + lcm);
	}
}
