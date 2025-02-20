package com.tuf;

public class ArmstrongNumber {

	static boolean isArmstrong(int num) {
		int sum = 0;
		int prod = 1;
		int temp = num;

		while(num > 0)
		{
			int rem = num % 10;
			sum += rem*rem*rem;
			num /= 10;
		}
		if (temp == sum)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int num = 371;
		boolean ans = isArmstrong(num);
		if (ans == true)
			System.out.println(num + " is Armstrong Number.");
		else
			System.out.println(num + " is Not Armstrong Number.");
	}
}
