package com.tuf;

public class GreatestOfThreeNums {
	public static void main(String args[]) {
		double num1 = 1.123, num2 = 1.124, num3 = 1.125;
		if (num1 > num2 && num1 > num3) {
			System.out.println("The greatest of the three numbers is " + num1);
		} else if (num2 > num1 && num2 > num3) {
			System.out.println("The greatest of the three numbers is " + num2);
		} else {
			System.out.println("The greatest of the three numbers is " + num3);
		}
	}
}
