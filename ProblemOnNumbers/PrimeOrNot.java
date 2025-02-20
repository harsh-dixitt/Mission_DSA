package com.tuf;

public class PrimeOrNot {

	static boolean isPrime(int num) {
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				count++;
		}

		if (count == 2)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int num = 790;
		boolean res = isPrime(num);
		if (res == true)
			System.out.println("Prime It is.");
		else
			System.out.println("Not a Prime Number.");
	}

}
