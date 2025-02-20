package com.tuf;

public class ReplaceZeroWithOne {

	static int replaceZerosWithOnes(int num) {
		if (num == 0) {
			return 1;
		}
		int ans = 0, tmp = 1;
		while (num > 0) {
			int rem = num % 10;
			if (rem == 0) {
				rem = 1;
			}
			ans = rem * tmp + ans;
			num = num / 10;
			tmp = tmp * 10;
		}
		return ans;
	}

	public static void main(String[] args) {

		int n = 204;
		int result = replaceZerosWithOnes(n);
		System.out.println("After replacing zeros with ones " + n + " becomes " + result);
	}
}
