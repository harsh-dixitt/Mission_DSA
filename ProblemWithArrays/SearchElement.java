package com.tuf;

public class SearchElement {

	static int searchElement(int arr[], int key, int n) {
		int ans = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] == key)
				ans = i;
		}
		return ans;
	}

	public static void main(String[] args)
	{
		int arr[] = {11,22,44,222,112,32};
		int key = 222;
		int n = arr.length;
		int res = searchElement(arr,key,n);
		if(res == -1)
			System.out.println("Element not present...Thanks");
		else
			System.out.println("Element present at "+res +" index position");
		
	}
}
