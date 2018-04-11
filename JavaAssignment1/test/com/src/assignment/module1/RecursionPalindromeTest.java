package com.src.assignment.module1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RecursionPalindromeTest {

	RecursionPalindrome palindrome = null;

	@Before
	public void setUp() throws Exception {

		palindrome = new RecursionPalindrome();
	}


	@Test
	public void is_valid_palindrome() {

		int x = 111;
		int expectedResult = 111;
		int actualResult = palindrome.Ispelindrum(x);
		Assert.assertEquals(expectedResult, actualResult);

	}
	
	@Test
	public void is_not_valid_palindrome() {

		int x = 112;
		int expectedResult = 111;
		int actualResult = palindrome.Ispelindrum(x);
		
		Assert.assertNotEquals(expectedResult, actualResult);

	}

}
