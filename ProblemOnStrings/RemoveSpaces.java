package com.tuf;

public class RemoveSpaces {
	static String removeVowels(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')  {
				str = str.substring(0, i) + str.substring(i + 1);
				i--;
			}
		}
		return str;
	}

	public static void main(String args[]) {
		String str = "Take u forward is Awesome";
		System.out.println(removeVowels(str));
	}
}
