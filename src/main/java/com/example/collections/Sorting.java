package com.example.collections;

import java.util.Random;

public class Sorting {

	/**
	 * selection sort
	 * О(n^2)
	 * 
	 * @param array is an array of Comparable objects
	 */
	public static <T extends Comparable<T>> void selectionSort(T[] array) {
		// loop from first element to 2nd element from the end
		for (int i = 0; i < array.length - 1; i++) {
			// find index of smallest element
			int smallest = findSmallest(array, i);
			// swap smallest with current position in array
			T temp = array[smallest];
			array[smallest] = array[i];
			array[i] = temp;
		}
	}

	/**
	 * find index of smallest item
	 * 
	 * @param array is an array of Comparable objects
	 * @param start is the first element
	 * @return the index of the smallest element
	 */
	private static <T extends Comparable<T>> int findSmallest(T[] array, int start) {
		int smallest = start; // the index of the smallest element
		// loop from current position to end of array
		for (int i = start; i < array.length; i++) {
			// if find a smaller element, then save the index
			if (array[i].compareTo(array[smallest]) < 0) {
				smallest = i;
			}
		}
		return smallest;
	}

	/**
	 * bubble sort
	 * О(n^2)
	 * 
	 * @param array is an array of Comparable objects
	 */
	public static <T extends Comparable<T>> void bubbleSort(T[] array) {
		// flag to see if an item was swapped or not
		boolean swap = false;
		// loop size - 1 times
		for (int i = 1; i < array.length; i++) {
			swap = false;
			// loop from beginning of array to (last element - i)
			for (int j = 0; j < array.length - i; j++) {
				// swap if 1st item greater than 2nd item
				if (array[j].compareTo(array[j + 1]) > 0) {
					// swap
					T temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					swap = true;
				}
			}
			// if no swaps, then break out of loop early
			if (!swap) {
				break;
			}
		}
	}

	/**
	 * insertion sort
	 * О(n^2)
	 * 
	 * @param array is an array of Comparable objects
	 */
	public static <T extends Comparable<T>> void insertionSort(T[] array) {
		// loop from 2nd item to end of array
		for (int i = 1; i < array.length; i++) {
			// store the item being inserted
			T temp = array[i];
			int j = i;
			// loop through sorted part of array
			while ((j > 0) && (temp.compareTo(array[j - 1]) < 0)) {
				// shift elements to the right
				array[j] = array[j - 1];
				j--;
			}
			// insert next item into sorted part
			array[j] = temp;
		}
	}

	/**
	 * merge sort
	 * O(n * log(n))
	 * 
	 * @param array is an array of Comparable objects
	 * @param start is the first element in the array
	 * @param end   is the last element in the array
	 */
	public static <T extends Comparable<T>> void mergeSort(T[] array, int start, int end) {
		// if start index is less than end index
		if (start < end) {
			int half = (start + end) / 2;
			// sort left & right half of array
			mergeSort(array, start, half);
			mergeSort(array, half + 1, end);
			// merge left & right half of array
			merge(array, start, half, end);
		}
	}

	/**
	 * 
	 * 
	 * @param array is an array of Comparable objects
	 * @param start is the first element in the array
	 * @param half  is the middle element in the array
	 * @param end   is the last element in the array
	 */
	private static <T extends Comparable<T>> void merge(T[] array, int start, int half, int end) {
		// uncomment for more detailed output:
		// print(array, start, end);
		// temporary array
		T[] temp = (T[]) new Comparable[array.length];
		// index for 2 subarrays
		int start1 = start;
		int end1 = half;
		int start2 = half + 1;
		int end2 = end;
		int i = start1;
		// loop & copy to temp array, so that elements are sorted
		while ((start1 <= end1) && (start2 <= end2)) {
			if (array[start1].compareTo(array[start2]) < 0) {
				temp[i] = array[start1];
				// increment i & start1
				i = i + 1;
				start1 = start1 + 1;
			} else {
				temp[i] = array[start2];
				// increment i & start2
				i = i + 1;
				start2 = start2 + 1;
			}
		}
		// loop through either the first or second subarray & copy to temp array
		while (start1 <= end1) {
			temp[i] = array[start1];
			// increment i & start1
			i = i + 1;
			start1 = start1 + 1;
		}
		while (start2 <= end2) {
			temp[i] = array[start2];
			// increment i & start2
			i = i + 1;
			start2 = start2 + 1;
		}
		// copy back to actual array
		i = start;
		while (i <= end) {
			array[i] = temp[i];
			i = i + 1;
		}
	}

	/**
	 * quick sort
	 * 
	 * @param array is an array of Comparable objects
	 * @param start is the first element in the array
	 * @param end   is the last element in the array
	 */
	public static <T extends Comparable<T>> void quickSort(T[] array, int start, int end) {
		if (start < end) {
			// split the table into two parts
			int pivot = partition(array, start, end);
			// sort the two parts
			quickSort(array, start, pivot - 1);
			quickSort(array, pivot + 1, end);
		}
	}

	/**
	 * partitions the array into two parts: smaller or greater/equal part
	 * 
	 * @param array is an array of Comparable objects
	 * @param start is the first element in the array
	 * @param end   is the last element in the array
	 * @return the index of the partition element
	 */
	private static <T extends Comparable<T>> int partition(T[] array, int start, int end) {
		// get pivot item (1st item)
		T pivot = array[start];
		// index of end element in smaller part
		int split = start;
		// loop from 2nd element to end of array
		for (int i = start + 1; i <= end; i++) {
			// put element in smaller or greater/equal part
			if (pivot.compareTo(array[i]) > 0) {
				// increase size of smaller part
				split = split + 1;
				// swap, so item is in smaller part
				T temp = array[i];
				array[i] = array[split];
				array[split] = temp;
				// uncomment for more detailed output:
				// print(array, start, end);
			}
		}
		// swap pivot with last element in smaller part
		// so pivot is between the two parts
		T temp = array[start];
		array[start] = array[split];
		array[split] = temp;
		return split;
	}

	/**
	 * Another quicksort implementation.
	 * O(n log n)
	 * 
	 */
	public static void quickSort(int[] arr, int fromInclusive, int toInclusive) {
		int i = fromInclusive;
		int j = toInclusive;
		if (i >= j)
			return;
		int pivot = arr[i + new Random().nextInt(j - i + 1)];
		do {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i > j)
				break;
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		} while (i <= j);
		quickSort(arr, fromInclusive, j);
		quickSort(arr, i, toInclusive);
	}
}
