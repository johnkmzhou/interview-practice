package com.example.collections;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

public class BinarySearchTest {
  @Test
  public void testBinarySearch() {
	  int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18};
	  assertEquals(5, BinarySearch.binarySearch(arr, 0, arr.length, 5));
	  assertEquals(3, BinarySearch.binarySearch(arr, 0, 10, 3));
	  assertEquals(-1, BinarySearch.binarySearch(arr, 0, arr.length, 20));
	  int[] arr2 = {1};
	  assertEquals(1, BinarySearch.binarySearch(arr2, 0, arr2.length, 1));
  }
}
