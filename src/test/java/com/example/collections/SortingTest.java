package com.example.collections;

import static org.testng.Assert.assertTrue;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SortingTest {
  @Test
  public void testQuickSort() {
	  int[] arr = {35, 34543, 21, 1, 2345, 44, 234, 12, 43, 43};
	  int[] sorted = {1, 12, 21, 35, 43, 43, 44, 234, 2345, 34543};
	  Sorting.quickSort(arr, 0, arr.length - 1);
	  Arrays.stream(arr).forEach(System.out::println);
	  assertTrue(Arrays.equals(arr, sorted));
  }
}
