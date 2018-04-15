package com.java.assignment2;

public class EmptrySpaceInPlaceSorting {

	// private static String String str;

	public static void main(String[] args) {
		String str = "I love India ";
		char[] charString = str.toCharArray();
		int length = str.length();
		System.out.println(replaceSpaceInString(charString, length));
		

	}

	private static char[] replaceSpaceInString(char[] str, int length) {
		int spaceCounter = 0;

		// First lets calculate number of spaces
		for (int i = 0; i < length; i++) {
			if (str[i] == ' ')
				spaceCounter++;
		}

		// calculate new size
		int newLength = length + 2 * spaceCounter;

		char[] newArray = new char[newLength + 1];
		newArray[newLength] = '\0';

		int newArrayPosition = 0;

		for (int i = 0; i < length; i++) {
			if (str[i] == ' ') {
				newArray[newArrayPosition] = '%';
				newArray[newArrayPosition + 1] = '2';
				newArray[newArrayPosition + 2] = '0';
				newArrayPosition = newArrayPosition + 3;
			} else {
				newArray[newArrayPosition] = str[i];
				newArrayPosition++;
			}
		}
		return newArray;
	}

	

}
