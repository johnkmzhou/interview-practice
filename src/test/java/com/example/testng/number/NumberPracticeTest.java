package com.example.testng.number;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.number.NumberPractice;

public class NumberPracticeTest {

	@Test
	public void testReverseInt() {
		int reverse = NumberPractice.reverseInt(123456789);
		Assert.assertEquals(reverse, 987654321);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testReverseIntWithException() {
		NumberPractice.reverseInt(1999999999);
	}

	@Test
	public void testGreatestCommonDivisor() {
		int gcd = NumberPractice.greatestCommonDivisor(16, 12);
		Assert.assertEquals(gcd, 4);
		gcd = NumberPractice.greatestCommonDivisor(12, 16);
		Assert.assertEquals(gcd, 4);
		gcd = NumberPractice.greatestCommonDivisor(270, 192);
		Assert.assertEquals(gcd, 6);
	}
}
