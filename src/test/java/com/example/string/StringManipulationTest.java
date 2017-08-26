package com.example.string;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringManipulationTest {
  @Test
  public void testIsAnagram() {
	  StringManipulation strMan = new StringManipulation();
	  boolean result = strMan.isAnagram("Cat", "Act");
	  Assert.assertEquals(result, true);
  }
  
  @Test
  public void testIsNotAnagram() {
	  StringManipulation strMan = new StringManipulation();
	  boolean result = strMan.isAnagram("Teest", "Test");
	  Assert.assertEquals(result, false);
  }
}
