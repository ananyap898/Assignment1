package com.src.assignment.module1;

public class SumOfNumberRecursion {
	/* Using the recursive way of finding sum of a given numbers */
	public static void main(String[] args) {

		System.out.println(sumOfNumbers(10));

	}
	/* using the mathematical formula 'sum = (n*n-1)/2' */

	public static int sumOfNumbers(int number) {
		if (number <= 1) {
			return number;
		}
		return (number * (number + 1)) / 2;

	}

}