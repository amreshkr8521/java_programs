package com.bridgelabz.DataStructure;

import java.io.*;

import java.util.Scanner;

import com.bridgelabz.dataStructure.utility.InputUtility;
import com.bridgelabz.dataStructure.utility.LinkedList;
import com.bridgelabz.dataStructure.utility.Utility;

/****************************************************************************************************
 * 
 * To read the file in string and ask the user to input some string type value
 * if the value is not present in the file than write the value in file or else
 * delete the value if found.
 * 
 * @author amresh kumar
 * @since 25-11-2019
 * @version 1.0
 *
 *****************************************************************************************************
 */
public class UnOrdered {

	static Scanner scanner = new Scanner(System.in);

	/**************************************************************
	 * To read the file from the hard drive.
	 * 
	 * @param filename --> string
	 * 
	 * @return string
	 * 
	 ************************************************************
	 */
	public static String readFile(String filename) {
		BufferedReader br;

		try {
			br = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		StringBuilder sb = new StringBuilder();
		try {
			br = new BufferedReader(new FileReader(filename));
			String line;
			while ((line = br.readLine()) != null)
				sb.append(line);
		} catch (IOException e) {
			System.out.println("Empty file " + e.getMessage());
		} finally {
			try {
				br = new BufferedReader(new FileReader(filename));

				br.close();
			} catch (IOException e) {
				System.out.println(e.getStackTrace());
			}
		}
		return sb.toString(); // returning in string format

	}

	/*********************************************************************
	 * 
	 * To write in the file after the all the process is done.
	 * 
	 * @throws IOException
	 * @param null
	 * @return void
	 * 
	 *********************************************************************
	 */
	public static void fileToList() throws IOException {
		LinkedList<String> list = new LinkedList<String>();
		System.out.println("Enter the word you want to search :");
		String item = InputUtility.nextLine();

		// read from file and assign into String s
		String s = Utility.readFromFile("C:\\Users\\amitv\\Desktop\\bridgelabz\\test.txt");

		String[] words = s.split(" ");

		// adding in data into linkedlist
		for (String word : words)
			list.add(word);

		// to write into file
		FileWriter fw = new FileWriter("C:\\Users\\amitv\\Desktop\\bridgelabz\\test.txt");

		// logic to search the word,remove and add
		if (list.search(item) == true) {
			list.remove(item);
		} else {
			list.add(item);
		}
		list.show();
		int size = list.size();

		// System.out.println(size);
		for (int i = 0; i <= size; i++) {
			fw.write(list.pop(0) + " ");
		}
		fw.close();// closing the file after writing on it
	}

	public static void main(String[] args) throws IOException {
		fileToList();
	}
}
