package com.example.testng.number;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.number.NumberPractice;

public class NumberPracticeTest {

	@Test
	public void testReverseInt() {
		NumberPractice num = new NumberPractice();
		int reverse = num.reverseInt(123456789);
		Assert.assertEquals(987654321, reverse);
	}
	
	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testReverseIntWithException() {
		NumberPractice num = new NumberPractice();
		num.reverseInt(1999999999);
	}
}
