package com.bridgelabz.dataStructure.utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.bridgelabz.DataStructure.Dequeue;
import com.bridgelabz.DataStructure.Stack;

public class Utility {
	private static BufferedReader bufferedReader = null;
	private static FileWriter fileWriter = null;
	

	/********************************************************************************************************************************
	 * 
	 * to sort the elements of the array using bubble sort technique
	 * 
	 * @param array  --> integer
	 * @param length --> integer
	 * @return integer
	 * 
	 ********************************************************************************************************************************
	 */
	public static int[] bubbleSort(int[] array, int length) {
		// Logic to sort the array
		int count1, count2, temporary;
		for (count1 = 0; count1 < length; count1++) {
			int flag = 0;
			for (count2 = 0; count2 < length - 1 - count1; count2++) {
				if (array[count2] > array[count2 + 1]) {
					// swapping the two elements in array to sort the array
					temporary = array[count2];
					array[count2] = array[count2 + 1];
					array[count2 + 1] = temporary;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		for (count1 = 0; count1 < length; count1++) {
			System.out.print(array[count1] + " ");
		}
		return array;
	}

	/**
	 * to read the data from file using buffered reader
	 * 
	 * @param filename
	 * @return String
	 */
	public static String readFromFile(String filename) {
		try {
			bufferedReader = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		StringBuilder stringBuilder = new StringBuilder();
		try {

			String line;
			while ((line = bufferedReader.readLine()) != null)
				stringBuilder.append(line);
		} catch (IOException e) {
			System.out.println("Empty file " + e.getMessage());
		} finally {
			try {

				bufferedReader.close();
			} catch (IOException e) {
				System.out.println(e.getStackTrace());
			}
		}
		return stringBuilder.toString();
	}

	/**
	 * To check if Arithmetic Expression is balanced or not
	 * 
	 * @param expression --> char[]
	 * @param length     --> integer
	 * @return boolean
	 */
	public static boolean balancedParenthesis(char[] expression, int length) {
		// object of Stack class
		Stack stack = new Stack(length);

		// logic to check parenthesis in expression
		for (int count = 0; count < length; count++) {
			if (expression[count] == '{' || expression[count] == '(' || expression[count] == '[')
				stack.push(expression[count]);
			if (expression[count] == '}' || expression[count] == ')' || expression[count] == ']') {
				if (stack.isEmpty()) {
					return false;
				} else {
					if (!isMatchingPair(stack.pop(), expression[count]))// matching the pair
						return false;
				}
			}
		}
		if (stack.isEmpty())
			return true;
		else
			return false;
	}

	/**
	 * define static function isMatchingPair() to match the opened and closed
	 * parenthesis to make pairs
	 * 
	 * @param character1 --> char
	 * @param character2 --> char
	 * @return boolean
	 */
	public static boolean isMatchingPair(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else if (character1 == '{' && character2 == '}')
			return true;
		else if (character1 == '[' && character2 == ']')
			return true;
		else
			return false;
	}

	public static boolean balancedParanthesischeck(String expression) {

		char[] tempExpression = expression.toCharArray();
		int length = tempExpression.length;

		// checking the parenthesis is balanced or not
		if (balancedParenthesis(tempExpression, length))
			return true;

		else
			return false;
	}

	/***************************************************************************************
	 * Return true if the string is palindrome or else return false
	 * 
	 * @param data -->String
	 * @return boolean
	 * 
	 **************************************************************************************
	 */
	public static boolean isPalindrome(String data) {
		// creating an object of Deque class
		Dequeue<Character> d = new Dequeue<Character>();

		for (int count = 0; count < data.length(); count++) {
			char charachter = data.charAt(count);// converting to array
			d.addFront(charachter);
		}

		String reverse = "";
		for (int countForReverse = 0; countForReverse < data.length(); countForReverse++) {
			reverse = reverse + d.removeFront();// reverse the string
		}

		if (reverse.equals(data)) {
			return true;
		} else
			return false;
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
	 * To check if the two given number is anagram or not
	 * 
	 * @param num1 int
	 * @param num2 int
	 * @return boolean
	 */
	public static boolean isAnagram(int num1, int num2) {
		int temporary = num2;
		int flag = 0;
		while (num1 != 0) {
			int temp = num1 % 10;
			while (temporary != 0) {
				if (temporary % 10 == temp)
					flag = 0;
				else
					flag = 1;
				temporary = temporary / 10;
			}
			num1 = num1 / 10;
		}
		if (flag == 0)
			return true;
		else
			return false;
	}

	/**********************************************************************
	 * 
	 * To check the number if it is both prime and anagram between 0-1000
	 * 
	 * @param -->null
	 * @return -->void
	 * 
	 *         ********************************************************************
	 */
	public static void primeAnagram() {
		// initialization of array
		int arr[] = new int[1000];
		// logic to check the prime numbers
		int number = 2;
		for (int digitsCount = 0; digitsCount < arr.length; digitsCount++) {
			if (Utility.isPrime(number)) {

				arr[digitsCount] = number;
			}
			number++;
		}
		System.out.println("Numbers that are prime and anagram : ");

		int[] first = new int[arr.length];

		// logic to check prime numbers are anagram or not
		for (int primeAnagramCount1 = 0; primeAnagramCount1 < arr.length; primeAnagramCount1++) {
			for (int primeAnagramCount2 = primeAnagramCount1 + 1; primeAnagramCount2 < arr.length; primeAnagramCount2++) {
				if (Utility.isAnagram(arr[primeAnagramCount1], arr[primeAnagramCount2]) && (arr[primeAnagramCount1] != 0 && arr[primeAnagramCount2] != 0)) {
					System.out.println(arr[primeAnagramCount1] + " && " + arr[primeAnagramCount2]); // displaying numbers which are prime and anagram
					first[primeAnagramCount1] = arr[primeAnagramCount1];
				}
			}
		}
		System.out.println("/////////////////////////////////////////////////////////////");
		int temporarycount = 0;
		int[][] array = new int[10][100];
		for (int row = 0; row < 10; row++) {
			for (int column = 0; column < 100; column++) {
				array[row][column] = first[temporarycount];
				temporarycount++;
				if (array[row][column] != 0)
					System.out.print(array[row][column] + "\t"); // displaying 2D Array
			}
			System.out.println();
		}
	}

	/******************************************************************************
	 * 
	 * To print the prime number which are anagram by implementing the queue method
	 * 
	 * @param null
	 * @return void
	 * 
	 ******************************************************************************
	 */
	public static void queuePrimeAnagram() {
		Queue<Integer> queue = new Queue<Integer>();

		// Logic to check the number is prime or not
		for (int countDigits = 2; countDigits <= 1000; countDigits++) {
			if (Utility.isPrime(countDigits)) {
				queue.enqueue(countDigits);
			}
		}
		int size = queue.size();
		int[] array = new int[size];

		// Logic to dequeue the number and store the numbers into array
		for (int count = 0; count < size; count++) {
			array[count] = queue.deQueue();
		}

		// Logic to check the prime numbers are anagram and store in queue
		for (int primeAnagramCount1 = 0; primeAnagramCount1 < size; primeAnagramCount1++) {
			for (int primeAnagramCount2 = primeAnagramCount1 + 1; primeAnagramCount2 < size; primeAnagramCount2++) {
				if (Utility.isAnagram(array[primeAnagramCount1], array[primeAnagramCount2]) && array[primeAnagramCount1] != 0 && array[primeAnagramCount2] != 0) {
					queue.enqueue(array[primeAnagramCount1]);
					queue.enqueue(array[primeAnagramCount2]);
				}
			}
		}
		queue.show();
	}
}
