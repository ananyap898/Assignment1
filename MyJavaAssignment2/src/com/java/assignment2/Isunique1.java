package com.java.assignment2;

// better way of doing time complexity o(n)
public class Isunique1 {
	static int count = 0;

	public static boolean isUnique(String name) {
		for (int i = 0; i < name.length(); i++) {
			int index = name.charAt(i) - 'a';
			if ((count & (1 << index)) > 0)
				return false;

			count = count | (1 << index);
		}

		return true;

	}
}