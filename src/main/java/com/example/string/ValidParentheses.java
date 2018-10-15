package com.example.string;

import java.util.Deque;
import java.util.LinkedList;

public class ValidParentheses {
	public static boolean isValid(String s) {
		char[] parens = s.toCharArray();
		Deque<Character> stack = new LinkedList<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (parens[i] == '(') {
				stack.push(')');
			} else if (parens[i] == '{') {
				stack.push('}');
			} else if (parens[i] == '[') {
				stack.push(']');
			} else if (stack.isEmpty() || stack.pop() != parens[i]) {
				return false;
			}
		}
		return stack.isEmpty();
	}
}
