package com.tuf;

import java.util.Arrays;

public class SecondLargest {
	static int getSecondLargest(int[] arr)
	{
		int n = arr.length;
		Arrays.sort(arr);
		
		for(int i = n - 2; i >= 0; i--)
		{
			if(arr[i] != arr[n - 1])
			{
				return arr[i];
			}
		}
		return -1;
	}

	
	public static void main(String[] args)
	{
		int arr[] = {2,5,1,3,0,11,22,45,45};
		System.out.println("Second Largest Element: "+getSecondLargest(arr));
	}
}
