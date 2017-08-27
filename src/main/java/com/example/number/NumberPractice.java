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
	public int reverseInt(int number) {
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
	public int greatestCommonDivisor(int a, int b) {
		int rem;
		if (a > b) {
			rem = a % b;
			if (rem != 0) {
				return greatestCommonDivisor(a, rem);
			}
			return b;
		} else {
			rem = b % a;
			if (rem != 0) {
				return greatestCommonDivisor(b, rem);
			}
			return a;
		}
	}
}
