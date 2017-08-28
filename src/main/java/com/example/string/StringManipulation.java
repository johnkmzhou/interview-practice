package com.example.string;

import java.util.HashMap;
import java.util.Map;

public class StringManipulation {

	/**
	 * Check if two strings contain the same characters in the same frequencies.
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public static boolean isAnagram(String a, String b) {
		Map<String, Integer> mapA = new HashMap<String, Integer>();
		for (String s : a.toLowerCase().split("")) {
			if (mapA.containsKey(s)) {
				mapA.put(s, mapA.get(s) + 1);
			} else {
				mapA.put(s, 1);
			}
		}
		Map<String, Integer> mapB = new HashMap<String, Integer>();
		for (String s : b.toLowerCase().split("")) {
			if (mapB.containsKey(s)) {
				mapB.put(s, mapB.get(s) + 1);
			} else {
				mapB.put(s, 1);
			}
		}
		return mapA.equals(mapB);
	}
}
