package com.java.assignment2;

public class CheckingPermutation {

	public static void main(String[] args) {
		// isPermutation("ananya", "aaany");
		if (isPermutation("ananya", "aabbcc")) {
			System.out.println("two string are permutation of each other");
		} else {
			System.out.println("two string are not permutation of each others");
		}

	}

	private static boolean isPermutation(String name1, String name2) {
		if (name1.length() != name2.length()) {
			return false;
		} else {
			for (int i = 0; i < name1.length(); i++)
				// System.out.println("YES");
				for (int j = 0; j < name2.length(); j++)
					// System.out.println("no");
					if (name1.charAt(i) != name2.charAt(j))
						// System.out.println("is permutation");

						return false;

			return true;

		}

	}

}