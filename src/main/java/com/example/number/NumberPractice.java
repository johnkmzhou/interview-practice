package com.example.number;

/**
 * This is for practicing number manipulation.
 * 
 * @author John
 *
 */
public class NumberPractice {

	/**
	 * Reverse the digits in a signed integer.
	 * 
	 * @param number
	 * @return
	 */
	public static int reverseInt(int number) {
		int newValue = 0;
		while (number != 0) {
			int remainder = number % 10;
			int temp = newValue * 10 + remainder;
			// check for overflow by reversing operation
			if ((temp - remainder) / 10 != newValue) {
				throw new IllegalArgumentException();
			}
			newValue = temp;
			number = (number - remainder) / 10;
		}
		return newValue;
	}

	/**
	 * Finds the greatest common divisor between two numbers.
	 * 
	 * @link https://en.wikipedia.org/wiki/Euclidean_algorithm
	 * @param a
	 * @param b
	 * @return
	 */
	public static int greatestCommonDivisor(int a, int b) {
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}

		if (a > b) {
			return greatestCommonDivisor(b, a % b);
		}
		return greatestCommonDivisor(a, b % a);

	}
}
