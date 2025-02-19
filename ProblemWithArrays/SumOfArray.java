package com.tuf;

public class SumOfArray {

	static void sumOfArrayElements(int arr[])
	{
		int sum = 0;
		int n = arr.length;
		for(int i = 0;i < n; i++)
		{
			sum += arr[i];
		}
		System.out.println("Sum of all the elements in the array: "+sum);
	}
	
	
	
	public static void main(String[] args)
	{
		int arr[] = {8,7,1,6,5,9};
		sumOfArrayElements(arr);
	}
}
