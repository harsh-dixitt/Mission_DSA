//     1 
//    2 2 
//   3 3 3 
//  4 4 4 4 
// 5 5 5 5 5 
//6 6 6 6 6 6 
package com.patterns;

public class NumberTrianglePattern {
	
	static void printPattern(int n)
	{
		int x = 0;
		for(int i = 1;i <= n; i++)
		{
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i; k++)
			{
				System.out.print(i +" ");
			}
			x++;
			System.out.println();
		}
	}
	
	public static void main(String args[])
    {
        int n = 6;
        printPattern(n);
    }
}
