package com.brdgelabz.utility;

/**
 * Algoritm utility class to have all the method that are to be used in the
 * algorithm programs
 * 
 * @author amresh kumar
 *
 */
public class AlgorithmUtility {

	/**
	 * 
	 * to search a number from an array using binary search
	 * 
	 * @param arr   			int         
	 * @param searchednumber 	int
	 * @param lasrIndex			int
	 * @param firstIndex		int
	 * 
	 * @return int
	 */
	public static int binarySearchIntiger(int[] arr, int searchednumber, int lastIndex, int firstIndex) {
		int middle = firstIndex + (lastIndex - firstIndex) / 2;
		if (lastIndex >= firstIndex) // checking if last index is greater than first index.
		{
			 middle = firstIndex + (lastIndex - firstIndex) / 2; // getting the middle index
			if (arr[middle] == searchednumber) // comparing the middle index number to the number to be searched
			{
				return middle; // returning the index of the searched number
			} else if (searchednumber > arr[middle]) // checking if number is greater than middle index number or not
			{
			middle=binarySearchIntiger(arr, searchednumber, lastIndex, middle); // recurtion of binarySearchIntiger() with
																				// new first,last index
			} else if (searchednumber < arr[middle]) // checking if number is less than middle index number or not
			{
			middle=binarySearchIntiger(arr, searchednumber, middle, firstIndex); // recurtion of binarySearchIntiger() with
																				// new first,last index
			}
		}
		return middle; // returning -1 if number not found
	}


	/**
	 * to sort an array using insertion sorting technique
	 * 
	 * @param array int[]
	 * 
	 */
	public static void insertionSort(int[] array) {
		for (int count = 0; count < array.length; count++) {
			int temp = array[count];
			for (int count1 = count + 1; count1 < array.length; count1++) {
				if (temp > array[count1]) {
					array[count] = array[count1];
					for (int count2 = count; count2 < count2; count++) {
						array[count2] = array[count];
					}
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
	}

	/**************
	 * To sort the array in bubble sorting technique the biggest value will take its
	 * place at first and so on
	 * 
	 * @param array int[]
	 */
	public static void bubbleSorting(int[] array) {
		int temp;
		// loop running from 0 to length of the array
		for (int count1 = 0; count1 < array.length; count1++) {
			for (int count = 0; count < array.length; count++) {
				if (array[count] >= array[count1]) // comparing values of array
				{
					// arranging the array
					temp = array[count1];
					array[count1] = array[count];
					array[count] = temp;
				}
			}
		}
		System.out.print("Sorted array =");
		for (int count = 0; count < array.length; count++)// loop for displaying the array
		{
			System.err.print(array[count] + " ");
		}
	}

	/**
	 * to check if the two Strings are anagram or not
	 * 
	 * @param param1 string
	 * @param param2 string
	 * @return boolean
	 */
	public static boolean isAnagram(String param1, String param2) {
		if (param1.length() == param2.length()) // checking the length of both the string
		{
			char[] string1 = param1.toCharArray(); // converting into char array
			char[] string2 = param2.toCharArray(); // converting into char array
			for (int count = 0; count < param1.length(); count++) // loop will continue till all letters are same or if
																	// any of the char is not found same
			{
				int flag = 0; // indicator
				for (int count1 = 0; count1 < param2.length(); count1++) {
					if (string1[count] == string2[count1]) // comparing the characters
						flag = 1; // changing the indicator if similar character found
				}
				if (flag == 0)
					return false;
			}
		}
		return true;
	}

	/**
	 * to print the range of prime number in the given range
	 * 
	 * @param num
	 */
	public static void primeRange(int num) {
		for (int count = 1; count <= num; count++) {
			if (isPrime(count))
				System.out.println(count + " ");
		}
	}

	/**
	 * To check if the number is prime or not
	 * 
	 * @param num
	 * @return boolean
	 */
	public static boolean isPrime(int num) {
		for (int count = 2; count <= num / 2; count++) {
			if (num % count == 0)
				return false;
		}
		return true;
	}

	/**
	 * To sort the array using selection sort in effective way
	 * 
	 * @param array int
	 * 
	 */
	public static void selectionSort(int[] array) {
		int temp;
		// loop runs from 0 to the length of the array
		for (int count1 = 0; count1 < array.length; count1++) {
			// loop runs from count1+1 to length of the array
			for (int count = count1 + 1; count <= array.length - 1; count++) {
				if (array[count1] > array[count])// comparing the elements
				{
					// replacing the array
					temp = array[count1];
					array[count1] = array[count];
					array[count] = temp;
				}
			}
		}
		// displaying sorted array
		System.out.print("Sorted array= ");
		for (int count = 0; count < array.length; count++) {
			System.out.print(array[count] + " ");
		}
	}

}
