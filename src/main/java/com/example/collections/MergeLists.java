package com.example.collections;

public class MergeLists {
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode l3 = null;
		if (l1 == null & l2 == null) {
			return null;
		} else if (l1 == null) {
			return l2;
		} else if (l2 == null) {
			return l1;
		}
		if (l1.val <= l2.val) {
			l3 = l1;
			l1 = l1.next;
		} else {
			l3 = l2;
			l2 = l2.next;
		}
		ListNode current = l3;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				current.next = l1;
				current = l1;
				l1 = l1.next;
			} else {
				current.next = l2;
				current = l2;
				l2 = l2.next;
			}
		}
		if (l1 == null) {
			current.next = l2;
		} else {
			current.next = l1;
		}
		return l3;
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
