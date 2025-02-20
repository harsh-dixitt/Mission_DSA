package com.tuf;

public class LeapYear {
	public static void main(String[] args)
	{
		int yr = 1900;
		if(yr % 400 == 0 || yr % 4 == 0 && yr % 100 != 0 )
		{
			System.out.println("Leap Year");
		}
		else
		{
			System.out.println("Not a Leap year");
		}
	}
}
