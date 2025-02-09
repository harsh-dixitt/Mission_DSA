/*
 * Question 04 --> Given an array which consists of only 0, 1 and 2. 
 * Sort the array without using any sorting algo

 *  Dutch National Flag Algorithm (also known as the three-way 
 *  partitioning algorithm) to efficiently sort the array in O(N) 
 *  time complexity with O(1) extra space.
 */

package com.dsa.arrays;

import java.util.Arrays;

public class Ques004 {
	public static void sortZeroOneTwo(int arr[])
	{
		int low = 0 , mid = 0, high = arr.length-1;
		
		while(mid <= high)
		{
			if(arr[mid] == 0) {
				swap(arr,low,mid);
				low++;
				mid++;
			}
			else if(arr[mid] == 1)
			{
				mid++;
			}
			else {
				swap(arr,mid,high);
				high--;
			}
		}
		
	}
	
	
	private static void swap(int arr[],int i , int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String[] args)
	{
		int[] arr = {2, 0, 1, 2, 1, 0, 0, 2, 1, 0};
		sortZeroOneTwo(arr);
		System.out.println("Sorted Array: "+Arrays.toString(arr));
	}
}
