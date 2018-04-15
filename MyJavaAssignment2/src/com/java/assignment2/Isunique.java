package com.java.assignment2;

public class Isunique {
	/* brute force approach where time complexity is o(n2) */

	boolean isUniqueCharacter(String name) {
		for (int i = 0; i < name.length(); i++)
			for (int j = i + 1; j < name.length(); j++)
				if (name.charAt(i) == name.charAt(j))

					return false;
		return true;

	}
}


