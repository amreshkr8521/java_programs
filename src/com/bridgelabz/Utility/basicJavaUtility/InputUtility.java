package com.brdgelabz.utility;

import java.util.Scanner;

/**
 * Utility class for all the input taking scanner methods
 * 
 * @author amresh kumar
 *
 */
public class InputUtility {
	private static Scanner scanner = new Scanner(System.in);

	// integer
	public static int nextInteger() {
		return scanner.nextInt();
	}

	// double
	public static double nextDouble() {
		return scanner.nextDouble();
	}

	// float
	public static float nextFloat() {
		return scanner.nextFloat();
	}

	// String
	public static String nextLine() {
		return scanner.nextLine();
	}

	// String
	public static String next() {
		return scanner.next();
	}

	// long
	public static long nextlong() {
		return scanner.nextLong();
	}
}
