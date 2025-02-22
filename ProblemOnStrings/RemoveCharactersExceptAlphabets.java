package com.tuf;

public class RemoveCharactersExceptAlphabets {
	static String removeVowels(String str, int n) {
		StringBuffer ans = new StringBuffer();

		for (int i = 0; i < n; i++) {
			int ascii = (int) str.charAt(i); // ascii value

			if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) // if alphabets
				ans.append(str.charAt(i));
		}
		return ans.toString();
	}

	public static void main(String args[]) {
		String str = "1.Take 2.u & forward *is*! Awesome";
		int n = str.length();
		System.out.println(removeVowels(str, n));
	}
}
