package com.tuf;

public class MaxProductSubArray {

	static int maxProductSubArray(int arr[]) {
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = i + 1; j < arr.length; j++) {
				int prod = 1;
				for (int k = i; k <= j; k++)
				   	prod *= arr[k];
				result = Math.max(result, prod);
			}
		return result;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, -3, 0, -4, -5 };
		int answer = maxProductSubArray(nums)
		System.out.print("The maximum product subarray is: " + answer);
	}
}

////////////////////////////////////////////////////////////////////////////

// static int maxProduct(int arr[]) {
// 	int maxProduct = arr[0];
// 	int minProduct = arr[0];
// 	int result = arr[0];

// 	for (int i = 1; i < arr.length; i++) {
// 		if (arr[i] < 0) {
// 			// Swap max and min when a negative number is encountered
// 			int temp = maxProduct;
// 			maxProduct = minProduct;
// 			minProduct = temp;
// 		}
// 		maxProduct = Math.max(arr[i], maxProduct * arr[i]);
// 		minProduct = Math.min(arr[i], minProduct * arr[i]);
// 		result = Math.max(result, maxProduct);
// 	}
// 	return result;
// }

// public static void main(String[] args) {
// 	int nums[] = { 1, 2, -3, 0, -4, -5 };
// 	int answer = maxProduct(nums);
// 	System.out.print("The maximum product subarray is: " + answer);
// }
