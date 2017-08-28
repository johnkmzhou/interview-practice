package com.example.string;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegularExpressionsTest {
  @Test
  public void testFilterDuplicateWords() {
	  RegularExpressions reg = new RegularExpressions();
	  String result = reg.filterDuplicateWords("I love Love love ice cream.");
	  Assert.assertEquals(result, "I love ice cream.");
  }
}
