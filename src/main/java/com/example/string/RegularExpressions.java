package com.example.string;

import java.util.regex.Pattern;

public class RegularExpressions {

	/**
	 * Filters out consecutive words.
	 * 
	 * @param s
	 * @return
	 */
	public String filterDuplicateWords(String s) {
		return Pattern.compile("\\b(\\w+)(\\s\\1)+\\b", Pattern.CASE_INSENSITIVE).matcher(s).replaceAll("$1");
	}
}
