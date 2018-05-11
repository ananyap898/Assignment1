package com.java.practicecode;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array1 = { 3, 26,24,23 };
		//System.out.println(Arrays.toString());
		
		for (int i = 0; i <= array1.length-1; i++) {
			for (int j = 0; j < array1.length-i-1; j++) {
				if (array1[j] > array1[j+1]) {
					int temp = array1[j];
					array1[j] = array1[j+1];
					array1[j+1] = temp;

				}
			}
			
		}
		System.out.println(Arrays.toString(array1));
	}

	
	}

	


