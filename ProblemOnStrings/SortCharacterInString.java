package com.tuf;

public class SortCharacterInString {
	public static String solve(String str, int n) {
		char[] arr = str.toCharArray();
		// bubble sort
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				// swap
				if (arr[j] > arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		String ans = new String(arr);
		return ans;
	}

	public static void main(String args[]) {
		String str = "zxcbg";
		int n = str.length();

		System.out.println("Before sorting:");
		System.out.println(str);
		System.out.println("After sorting:");
		System.out.println(solve(str, n));
	}
}

/////////////////////////////////////////////////////////////////////////


//public class sort_char {
//	  public static String solve(String str) {
//	    char[] char_arr = str.toCharArray();
//	    Arrays.sort(char_arr);
//	    // Creating object of String class
//	    String ans = new String(char_arr);
//	    return ans;
//	  }
//
//	  public static void main(String args[]) {
//	    String str = "zxcbg";
//
//	    System.out.println("String after sorting:");
//	    System.out.println(solve(str));
//	  }
