package com.tuf;

public class AverageOfElements {

	static void avgOfArrayElements(int arr[])
	{
		int sum = 0;
		int n = arr.length;
		for(int i = 0;i < n; i++)
		{
			sum += arr[i];
		}
		System.out.println("Average of the elements in the array: "+sum/n);
	}
	
	
	
	public static void main(String[] args)
	{
		int arr[] = {8,7,1,6,5,9};
		avgOfArrayElements(arr);
	}
}
