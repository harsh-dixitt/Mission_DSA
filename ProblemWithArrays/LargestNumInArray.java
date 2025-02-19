package com.tuf;

public class LargestNumInArray {
	static int maxElement(int arr[])
	{
		int n = arr.length;
		int maxEle = arr[0];
		for(int i = 0; i < n; i++)
		{
			if(arr[i] > maxEle)
				maxEle = arr[i];	
		}
		return maxEle;
	}
	
	public static void main(String[] args)
	{
		int arr[] = {2,5,1,3,0};
		int res = maxElement(arr);
			System.out.println("Maximum Element in the array is "+res);
	}

}
