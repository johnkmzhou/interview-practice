package com.example.string;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringManipulationTest {
  @Test
  public void testIsAnagram() {
	  boolean result = StringManipulation.isAnagram("Cat", "Act");
	  Assert.assertEquals(result, true);
  }
  
  @Test
  public void testIsNotAnagram() {
	  boolean result = StringManipulation.isAnagram("Teest", "Test");
	  Assert.assertEquals(result, false);
  }
}
