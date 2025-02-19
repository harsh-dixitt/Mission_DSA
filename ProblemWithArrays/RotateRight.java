package com.tuf;

public class RotateRight {
	public static void Rotatetoright(int[] arr, int n, int k) {
	    if (n == 0)
	      return;
	    k = k % n;
	    if (k > n)
	      return;
	    int[] temp = new int[k];
	    // iss loop se jitne elements aap right shift kroge vo temp array me store honge 
	    // in this case we have 2 elements which are 6 and 7 bcz they are at extreme in org array
	    for (int i = n - k; i < n; i++) {
	      temp[i - n + k] = arr[i];
	    }
	    
	    // remaining elements ko 2 baar right shift krna
	    /*
	     * arr[5] = arr[3]
	     * arr[4] = arr[2]
	     * arr[3] = arr[1]
	     * arr[2] = arr[0]
	     */
	    for (int i = n - k - 1; i >= 0; i--) {
	      arr[i + k] = arr[i];
	    }
	    
	    // temp array me jo 6 and 7 store hn unko org array me shi position me store krte hn
	    for (int i = 0; i < k; i++) {
	      arr[i] = temp[i];
	    }
	}

	public static void main(String[] args) {
		int n = 7;
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int k = 2;
		Rotatetoright(arr, n, k);
		System.out.println("After Rotating the elements to right ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
