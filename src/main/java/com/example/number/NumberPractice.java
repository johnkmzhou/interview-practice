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
}
