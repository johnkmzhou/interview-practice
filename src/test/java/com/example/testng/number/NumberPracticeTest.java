package com.example.testng.number;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.number.NumberPractice;

public class NumberPracticeTest {
	NumberPractice num = new NumberPractice();

	@Test
	public void testReverseInt() {
		int reverse = num.reverseInt(123456789);
		Assert.assertEquals(reverse, 987654321);
	}

	@Test(expectedExceptions = IllegalArgumentException.class)
	public void testReverseIntWithException() {
		num.reverseInt(1999999999);
	}

	@Test
	public void testGreatestCommonDivisor() {
		int gcd = num.greatestCommonDivisor(16, 12);
		Assert.assertEquals(gcd, 4);
		gcd = num.greatestCommonDivisor(12, 16);
		Assert.assertEquals(gcd, 4);
		gcd = num.greatestCommonDivisor(270, 192);
		Assert.assertEquals(gcd, 6);
	}
}
