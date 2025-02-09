//Reverse the array

package com.dsa.arrays;

public class Ques001 {
	
	static void reverseArray(int arr[], int tarr[])
	{
		int j = arr.length-1;
		for(int i = 0; i < arr.length;i++){
			tarr[j] = arr[i];
			j--;
			
		}
		
		for(int x = 0; x < arr.length;x++)
		{
			System.out.print(tarr[x] + " ");
		}
	}
	
	public static void main(String args[]) {
		int arr[] = {3,1,5,4,8};
		int tarr[] = new int[arr.length];

		reverseArray(arr,tarr);
		
	}

}
