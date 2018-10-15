package com.example.collections;

public class BinarySearch {
	public static int binarySearch(int[] arr, int fromInclusive, int toExclusive, int key) {
		int low = fromInclusive;
		int high = toExclusive - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			int midVal = arr[mid];
			if (midVal < key) {
				low = mid + 1;
			} else if (midVal > key) {
				high = mid - 1;
			} else {
				return key;
			}
		}
		return -1;
	}
}
