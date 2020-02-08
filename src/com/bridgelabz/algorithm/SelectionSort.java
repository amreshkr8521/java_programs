package com.bridgelabz.algorithm;

import com.brdgelabz.utility.AlgorithmUtility;
import com.brdgelabz.utility.InputUtility;

/**
 * To sort and print the array using selection sort technique
 * 
 * @author amresh
 *
 */
public class SelectionSort {
	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		int size = InputUtility.nextInteger();
		int array[] = new int[size];
		System.out.println("Enter the numbers");
		for (int count = 0; count < size; count++) {
			array[count] = InputUtility.nextInteger();
		}
		AlgorithmUtility.selectionSort(array);
	}
}
