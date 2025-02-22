package com.tuf;

public class MaxOccuringChar {
	public static char findMaxOccurringChar(String str) {
		int[] freq = new int[256]; // Frequency array for ASCII characters
		int maxFreq = 0;
		char maxChar = ' ';

		// Count frequency of each character
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			freq[ch]++;

			// Update max frequency character
			if (freq[ch] > maxFreq) {
				maxFreq = freq[ch];
				maxChar = ch;
			}
		}
		return maxChar;
	}

	public static void main(String[] args) {
		String str = "takeuforward";
		char maxChar = findMaxOccurringChar(str);
		System.out.println("Most occurring character: " + maxChar);
	}
}
