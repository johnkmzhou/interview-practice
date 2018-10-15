package com.example.testng.number;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.example.string.ValidParentheses;

public class ValidParenthesesTest {
	@Test
	public void testIsValid() {
		assertFalse(ValidParentheses.isValid("("));
		assertFalse(ValidParentheses.isValid("()]"));
		assertTrue(ValidParentheses.isValid("()"));
		assertTrue(ValidParentheses.isValid("()[]{}"));
		assertFalse(ValidParentheses.isValid("([)]"));
		assertTrue(ValidParentheses.isValid("{[]}"));
	}
}
