package com.tuf;

import java.util.Arrays;

public class IncDecOrder {
	public static void main(String[] agrs)
	{
		int arr[] = {8,7,1,6,5,9};
		int n = arr.length;
		Arrays.sort(arr); // 1,5,6,7,8,9
		for(int i = 0; i < n/2;i++)
		{
			System.out.print(arr[i]+" "); // 1,5,6
		}
		for(int j = n -1; j >= n/2;j--)
		{
			System.out.print(arr[j]+" "); // 9,8,7
		}
	}

}
