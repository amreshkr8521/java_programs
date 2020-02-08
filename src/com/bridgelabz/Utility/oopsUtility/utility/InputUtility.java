package com.bridgelabz.oops.utility;

import java.util.Scanner;

/**
 * Utility class for all the input taking scanner methods
 * 
 * @author user
 *
 */
public class InputUtility {
	private static Scanner scanner = new Scanner(System.in);

	public static int nextInteger() {
		return scanner.nextInt();
	}

	public static double nextDouble() {
		return scanner.nextDouble();
	}

	public static float nextFloat() {
		return scanner.nextFloat();
	}

	public static String nextLine() {
		return scanner.nextLine();
	}

	public static String next() {
		return scanner.next();
	}

	public static long nextlong() {
		return scanner.nextLong();
	}
}
