package com.tuf;

public class RemoveBrackets {

	static String solve(String input1) {
		StringBuilder answer = new StringBuilder("");
		for (int i = 0; i < input1.length(); i++) {
			char ch = input1.charAt(i);
			if (ch != '(' && ch != ')') {
				answer.append(input1.charAt(i));
			}
		}
		return answer.toString();
	}

	public static void main(String[] args) {

		String input1 = "a+((b-c)+d)";

		System.out.println("Original String: " + input1);
		System.out.println("After removing brackets: " + solve(input1));
	}
}