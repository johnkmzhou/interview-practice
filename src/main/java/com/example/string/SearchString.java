package com.example.string;

public class SearchString {
	public static int strStr(String haystack, String needle) {
		if ("".equals(needle))
			return 0;
		for (int i = 0; i <= haystack.length() - needle.length(); i++) {
			if (needle.equals(haystack.substring(i, needle.length() + i)))
				return i;
		}
		return -1;
	}
}
