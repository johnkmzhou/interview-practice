package com.example.string;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class SearchStringTest {
	@Test
	public void testStrStr() {
		assertEquals(SearchString.strStr("hello", ""), 0);
		assertEquals(SearchString.strStr("hello", "ll"), 2);
		assertEquals(SearchString.strStr("aaaaa", "bba"), -1);
		assertEquals(SearchString.strStr("mississippi", "issip"), 4);
		assertEquals(SearchString.strStr("a", "a"), 0);
		assertEquals(SearchString.strStr("mississippi", "issipi"), -1);
	}
}
