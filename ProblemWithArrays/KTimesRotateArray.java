package com.tuf;
import java.util.Arrays;

public class CircularRotation {
    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n
        if (k < 0) k += n; // Handle negative k (left rotation)

        // Reverse the whole array
        reverse(arr, 0, n - 1);
        // Reverse first K elements
        reverse(arr, 0, k - 1);
        // Reverse remaining elements
        reverse(arr, k, n - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original Array: " + Arrays.toString(arr));
        rotateArray(arr, k);
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}
