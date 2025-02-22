package com.tuf;

public class PrintDuplicates {
	public static void printDuplicateChars(String str) {
		int[] freq = new int[256]; // Array to store character frequencies

		// Step 1: Count frequency of each character
		for (int i = 0; i < str.length(); i++) {
			freq[str.charAt(i)]++;
		}

		// Step 2: Print characters with frequency > 1
		System.out.println("Duplicate characters in the string:");
		for (int i = 0; i < 256; i++) {
			if (freq[i] > 1) {
				System.out.println((char) i + " → " + freq[i]);
			}
		}
	}

	public static void main(String[] args) {
		String str = "takeuforward";
		printDuplicateChars(str);
	}
}
