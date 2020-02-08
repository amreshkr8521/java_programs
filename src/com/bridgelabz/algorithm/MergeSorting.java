

package com.bridgelabz.algorithm;

import com.brdgelabz.utility.InputUtility;

/**
 * to sort an array using merge sorting technique 
 * which is the most effective way to sort any array.
 * In this technique divide and rule method is used 
 * 
 * @author amresh kumar
 *
 * @version 1.0
 */
public class MergeSorting {
	// static int lowerIndex=0,higherIndex=0,middle;
	static int[] array;

	public static void mergeSort(int[] arr, int length) {
		array = new int[length];
		for (int fact = 0; fact < length; fact++) {
			array[fact] = arr[fact];
			// System.out.println(array[fact]);
		}

		System.out.println(length - 1);

		divideArray(0, length - 1);
	}

	/**
	 * to divide the array to an individual character
	 * 
	 * @param lowerIndex  int
	 * @param higherIndex int
	 */
	public static void divideArray(int lowerIndex, int higherIndex) {
		// System.out.println("a" +lowerIndex+ " "+ higherIndex);
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			System.out.println(middle);
			divideArray(lowerIndex, middle); // recurtion to divide further

			divideArray(middle + 1, higherIndex);// recurtion to divide further
			merge(lowerIndex, middle, higherIndex); // to merge the divided array
		}
	}

	/**
	 * To merge the array into a single array and sort the array while inserting
	 * 
	 * @param lowerIndex  int
	 * @param middle      int
	 * @param higherIndex int
	 */
	public static void merge(int lowerIndex, int middle, int higherIndex) {
		int lower = lowerIndex;
		int high = middle + 1;
		int index = lowerIndex;
		int[] temp = new int[array.length];
		for (int fact = 0; fact < array.length; fact++) {
			temp[fact] = array[fact];

		}
		while (lower < middle && high < higherIndex) {
			if (temp[lower] <= temp[high]) {

				array[index] = temp[lower];
				lower++;

			} else {
				array[index] = temp[high];
				high++;
			}
			index++;
		}
		while (lower <= high) {
			array[index] = temp[lower];
			index++;
			lower++;
		}
		while (high < higherIndex) {
			array[index] = temp[high];
			high++;
			index++;
		}

	}

//main method
	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		int size = InputUtility.nextInteger();
		int array[] = new int[size];
		System.out.println("Enter the numbers");
		for (int count = 0; count < size; count++) {
			array[count] = InputUtility.nextInteger();
		}

		mergeSort(array, array.length);// calling the mergesort() to merge the arr

	}
}
