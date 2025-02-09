package com.dsa.arrays;

import java.util.Arrays;

public class Ques003 {
	public static int kthSmallestSort(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k - 1]; // k-th smallest is at index k-1
	}

	public static void main(String[] args) {
		int arr[] = { 4, 3, 2, -1, 44 };
		int ans = kthSmallestSort(arr,3);
		System.out.println(ans);

	}

}
