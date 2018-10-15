package com.example.collections;

public class RemoveDuplicatesFromSortedArray {
	public static int removeDuplicates(int[] nums) {
		int index = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[index] != nums[i]) {
				index++;
				nums[index] = nums[i];
			}
		}
		return ++index;
	}
}
