package com.example.string;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegularExpressionsTest {

	@Test
	public void testFilterDuplicateWords() {
		String result = RegularExpressions.filterDuplicateWords("I love Love love ice cream.");
		Assert.assertEquals(result, "I love ice cream.");

		result = RegularExpressions.filterDuplicateWords("I am watching watching the the game.");
		Assert.assertEquals(result, "I am watching the game.");
	}
}
