package com.tuf;

public class ReverseArray {

	static void reverseArray(int arr[]) {
		int n = arr.length;
		int[] drr = new int[n];
		int j = 0;
		for (int i = n - 1; i >= 0; i--) {
			drr[j] = arr[i];
			j++;
		}
		printArray(drr, n);
	}

	static void printArray(int drr[], int n) {
		System.out.print("Reversed array is:- \n");
		for (int i = 0; i < n; i++) {
			System.out.print(drr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 5, 1, 3, 0 };
		reverseArray(arr);
	}
}
