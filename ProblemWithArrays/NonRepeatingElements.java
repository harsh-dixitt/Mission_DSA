package com.tuf;

public class NonRepeatingElements {
	static void findNonRepeatingElement(int nums[]) {
		boolean chk;
		for (int i = 0; i < nums.length; i++) { 
			chk = false;
			for (int j = 0; j < nums.length; j++) {
				if (i != j && nums[i] == nums[j]) {
					chk = true;
					break;
				}
			}
			if (!chk)
				System.out.print(nums[i] + " ");
		}
	}

	public static void main(String[] args) {
		int nums[] = { 1, 2, -1, 1, 3, 1 };
		System.out.println("Non-repeating numbers are: ");
		findNonRepeatingElement(nums);
	}
}

\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

// static void findNonRepeatingElement(int nums[]) {
// 	HashMap<Integer, Integer> freqMap = new HashMap<>();
	
// 	// Count occurrences
// 	for (int num : nums)
// 		freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
	
// 	// Print non-repeating elements
// 	for (int num : nums)
// 		if (freqMap.get(num) == 1)
// 			System.out.print(num + " ");
// }

// public static void main(String[] args) {
// 	int nums[] = { 1, 2, -1, 1, 3, 1 };
// 	System.out.println("Non-repeating numbers are: ");
// 	findNonRepeatingElement(nums);
// }

// Time Complexity: O(n) 