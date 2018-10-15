package com.example.collections;

import static org.testng.Assert.assertTrue;

import java.util.Arrays;

import org.testng.annotations.Test;

public class MergeListsTest {
	@Test
	public void testMergeTwoLists() {
		MergeLists.ListNode m1 = new MergeLists.ListNode(1);
		MergeLists.ListNode m2 = new MergeLists.ListNode(2);
		MergeLists.ListNode m3 = new MergeLists.ListNode(4);
		m1.next = m2;
		m2.next = m3;

		MergeLists.ListNode n1 = new MergeLists.ListNode(1);
		MergeLists.ListNode n2 = new MergeLists.ListNode(3);
		MergeLists.ListNode n3 = new MergeLists.ListNode(4);
		n1.next = n2;
		n2.next = n3;

		MergeLists.ListNode merged = MergeLists.mergeTwoLists(m1, n1);
		int[] result = new int[6];
		int index = 0;
		while (merged != null) {
			result[index] = merged.val;
			merged = merged.next;
			index++;
		}
		assertTrue(Arrays.equals(result, new int[] { 1, 1, 2, 3, 4, 4 }));
	}
}
