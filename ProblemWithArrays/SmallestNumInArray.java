package com.tuf;

public class SmallestNumInArray {
	static int minElement(int arr[])
	{
		int n = arr.length;
		int minEle = arr[0];
		for(int i = 0; i < n; i++)
		{
			if(arr[i] < minEle)
				minEle = arr[i];	
		}
		return minEle;
	}
	
	public static void main(String[] args)
	{
		int arr[] = {2,5,1,3,0};
		int res = minElement(arr);
			System.out.println("Minimum Element in the array is "+res);
	}

}
