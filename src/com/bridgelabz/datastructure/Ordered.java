package com.bridgelabz.DataStructure;

import java.io.*;

import com.bridgelabz.dataStructure.utility.InputUtility;
import com.bridgelabz.dataStructure.utility.LinkedList;
import com.bridgelabz.dataStructure.utility.Utility;

/**
 * To take the input in integer and if the input is not found in the file then
 * write or else delete the file.
 *
 * @author amresh kumar
 * @since 25-11-2019
 * @version 1.0
 */
public class Ordered {
	private static BufferedReader br;

	/*********************************************************************************************************
	 * To take the input in integer and if the input is not found in the file then
	 * write or else delete the file.
	 * 
	 * @throws IOException
	 * @param null
	 * @return void
	 * 
	 *         *******************************************************************************************************
	 */
	public static void ordered() {

		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println("Enter the number you want to search");
		Integer item = InputUtility.nextInteger();

		// logic to read elements from file and store in string
		String str = Utility.readFromFile("C:\\Users\\amitv\\Desktop\\bridgelabz\\test.txt");
		String[] strArray = str.split(" "); // split the file with blank space
		int size = strArray.length;

		int[] array = new int[size];

		for (int count = 0; count < size; count++) {
			array[count] = Integer.parseInt(strArray[count]);
		}

		// sorting the array
		int[] sortedArray = Utility.bubbleSort(array, size);

		// adding in data into linkedlist
		for (Integer num : sortedArray) {
			list.add(num);
		}

		// write into file
		FileWriter fileWriter = null;
		try {
			fileWriter = new FileWriter("C:\\Users\\amitv\\Desktop\\bridgelabz\\test.txt");
		} catch (IOException e) {

			e.printStackTrace();
		}
		// logic to search the item into the file
		if (list.search(item) == true) {
			list.remove(item); // removing the item if its already in file
		} else {
			list.add(item); // adding the item into file
		}
		list.show();
		int length = list.size();
		// writing in the file after the process
		for (int count = 0; count <= length; count++) {
			try {
				fileWriter.write(list.pop(0) + " ");
			} catch (IOException e) {

				e.printStackTrace();
			}
		}
		try {
			fileWriter.close();
		} catch (IOException e) {

			e.printStackTrace();
		} // closing the file
	}

}
