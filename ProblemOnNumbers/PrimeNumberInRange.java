package com.tuf;

public class PrimeNumberInRange {
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
		int min = 1;
		int max = 100;
		
		for(int i = min ; i <= max; i++)
		{
			if(isPrime(i))
				System.out.print(i+" ");
		}
	}

}
