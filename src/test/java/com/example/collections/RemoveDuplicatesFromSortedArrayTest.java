package com.example.collections;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Arrays;

import org.testng.annotations.Test;

public class RemoveDuplicatesFromSortedArrayTest {
  @Test
  public void testRemoveDuplicates() {
	  int[] d = {0,0,1,1,1,2,2,3,3,4};
	  assertEquals(RemoveDuplicatesFromSortedArray.removeDuplicates(d), 5);
	  assertTrue(Arrays.equals(Arrays.copyOfRange(d, 0, 5), new int[] {0,1,2,3,4}));
  }
}
