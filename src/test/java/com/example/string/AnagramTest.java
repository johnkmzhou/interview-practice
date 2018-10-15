package com.example.string;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AnagramTest {
  @Test
  public void testIsAnagram() {
	  boolean result = Anagram.isAnagram("Cat", "Act");
	  Assert.assertEquals(result, true);
  }
  
  @Test
  public void testIsNotAnagram() {
	  boolean result = Anagram.isAnagram("Teest", "Test");
	  Assert.assertEquals(result, false);
  }
}
