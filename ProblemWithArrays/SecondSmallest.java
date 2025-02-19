package com.tuf;

import java.util.Arrays;

public class SecondSmallest {
	
	static int getSecondSmallest(int arr[])
	{
		int n  = arr.length;
		Arrays.sort(arr);
		for(int i = 0; i < n; i++)
		{
			if(arr[i] != arr[i+1])
				return arr[i+1];
		}
		return -1;
	}
	
	
	public static void main(String[] args)
	{
		int arr[] = {1,1,2,4,22,41,6,3,6};
		System.out.println("Second Minimum Element in the array: "+getSecondSmallest(arr));
	}
}
