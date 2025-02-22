package com.tuf;

public class WildCardMatching {
	public static boolean isMatch(String str, String pattern) {
		// Convert wildcard pattern to regex pattern
		String regexPattern = pattern.replace("?", ".").replace("*", ".*");

		// Use matches() method to compare
		return str.matches(regexPattern);
	}

	public static void main(String[] args) {
		String str = "abcde";
		String pattern = "a*?e"; // Expected match

		System.out.println("Do they match? " + isMatch(str, pattern));
	}
}
