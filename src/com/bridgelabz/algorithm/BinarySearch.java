package com.bridgelabz.algorithm;

import com.brdgelabz.utility.AlgorithmUtility;
import com.brdgelabz.utility.InputUtility;

/**
 * To search an element from the array
 * 
 * @author amresh kumar
 *
 */
public class BinarySearch {
	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		int size = InputUtility.nextInteger();
		int array[] = new int[size];
		System.out.println("Enter the numbers");
		for (int count = 0; count < size; count++) {
			array[count] = InputUtility.nextInteger();
		}
		System.out.println("Enter the number you want to search");
		AlgorithmUtility.binarySearchIntiger(array, InputUtility.nextInteger(), size - 1, 0);

	}
}
