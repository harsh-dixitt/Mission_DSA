package com.dsa.arrays;

public class Ques002 {
	public static int maxElement(int arr[])
	{
		int max_ele = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max_ele)
			{
				max_ele=arr[i];
			}
		}
		return max_ele;
		
	}
	public static int minElement(int arr[])
	{
		int min_ele = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min_ele)
			{
				min_ele=arr[i];
			}
		}
		return min_ele;
		
	}

    public static void main(String args[]) {
        int arr[] = {3, 1, 5, 4, 8, -2, 10, 7};
        int max = maxElement(arr);
        int min = minElement(arr);
        System.out.println("Max Element in the array: "+max);
        System.out.println("Min Element in the array: "+min);
    }
}
