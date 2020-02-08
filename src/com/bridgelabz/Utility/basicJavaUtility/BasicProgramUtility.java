package com.brdgelabz.utility;

public class BasicProgramUtility {

	/**
	 * To replace the <<UserName>> from the user Entered name from the text "Hello
	 * <<UserName>>, How are You?" if the user entered name size is greater than or
	 * equal to 3
	 * 
	 * @param text String
	 * @param name String
	 * @return String
	 */
	public static String stringReplace(String text, String name) {
		if (name.length() >= 3)
			return text.replace("<<UserName>>", name);
		else
			return name + " has less character";
	}

	/**
	 * To flip coin the number of time the user wants and show the percentage of
	 * head and tail
	 * 
	 * @param turn int
	 */
	public static void flipCoin(int turn) {
		int temp = turn;
		double head = 0;
		double tail = 0;
		while (turn != 0) {
			if (Math.random() > .5) {
				head++;
				turn--;
				System.out.println("Head ");
			} else {
				tail++;
				turn--;
				System.out.println("Tail ");
			}
		}

		double headPercent = (head / temp) * 100;
		double tailPercent = 100 - headPercent;
		System.out.println("head % = " + headPercent + ": tail % = " + tailPercent);
	}

	/**
	 * To check if the enterd year is leap year or not.
	 * 
	 * @param year int
	 * @return boolean
	 */
	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * prints a table of the powers of 2 only if input is greater than or equal to 0
	 * and less than 31.
	 * 
	 * @param num int
	 */
	public static void powerOfTwo(int num) {
		int count = 0;
		int pow = 1;
		if (num < 31 && num >= 0) {
			System.out.println("2^" + count + " = " + pow);
			count = 1;
			while (num > 0) {
				pow = 2 * pow;
				System.out.println("2^" + count + " = " + pow);
				count++;
				num--;
			}
		}
	}

	/**
	 * To calculate the sum of the harmonic number of the pattern 1/1 + 1/2 + 1/3 +
	 * 1/4 +...+1/N
	 * 
	 * @param number int
	 * @return double
	 */
	public static double harmonicNumbers(int number) {
		float harmonic = 1;
		System.out.print("1/1 ");
		for (int count = 2; count <= number; count++) {

			System.out.print("1/" + count + " ");
			harmonic = harmonic + (float) 1 / count;
		}
		return harmonic;
	}

	/**
	 * to find the prime factor of the number
	 * 
	 * @param num int
	 */
	public static void primeFactor(int num) {
		System.out.println("1");
		for (int i = 2; i < num; i++) {
			while (num % i == 0) {
				System.out.println(i + " ");
				num = num / i;
			}
		}
		if (num > 2) {
			System.out.println(num);
		}
	}

}
