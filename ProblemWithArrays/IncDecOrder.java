package com.tuf;

import java.util.Arrays;

public class IncDecOrder {
	public static void main(String[] agrs)
	{
		int arr[] = {8,7,1,6,5,9};
		int n = arr.length;
		Arrays.sort(arr);
		for(int i = 0; i < n/2;i++)
		{
			System.out.print(arr[i]+" ");
		}
		for(int j = n -1; j >= n/2;j--)
		{
			System.out.print(arr[j]+" ");
		}
	}

}
