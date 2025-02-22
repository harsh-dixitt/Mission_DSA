package com.tuf;

public class ConcatenateString {
	/*
	 * There are 3 ways 1.Using + Operator (Simplest Approach) 2. Using concat()
	 * Method 3. Using StringBuilder (Efficient for Multiple Concatenations)
	 */

	public static void main(String args[]) {
		String str1 = "Lionel ";
		String str2 = "Messi";
		String str3 = "Lamine ";
		String str4 = "Yamal";

		String strConcat = str1 + str2;
		System.out.println(strConcat);

		String strConcat2 = str3.concat(str4);
		System.out.println(strConcat2);

		StringBuilder strbuilder = new StringBuilder("Harsh ");
		strbuilder.append("Dixit");
		
		System.out.println(strbuilder);

	}
}
