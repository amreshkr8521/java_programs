package com.bridgelabz.junit;

import com.brdgelabz.utility.InputUtility;

/**
 * To divide binary number in two half
 * 
 * @author amresh kumar
 *
 */
public class Binary {
	/**
	 * count the number of digits
	 * 
	 * @param num
	 * @return int
	 */
	public static int intCount(int num) {
		int count = 0;
		while (num != 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	/**
	 * swap the given number
	 * 
	 * @param num int
	 */
	public static void swap(int num) {
		int bin1 = 0, bin2 = 0;
		int count = intCount(num);
		int temp_num = num;
		while (count != 0) {

			if (count <= intCount(temp_num) / 2) {
				int temp = num % 10;

				bin1 = bin1 * 10 + temp;
				num = num / 10;
				System.out.print("a");
				count--;
			} else {
				int temp = num % 10;

				bin2 = bin2 * 10 + temp;
				num = num / 10;
				count--;

				System.out.print("b");
			}
		}
		while (intCount(temp_num) / 2 != intCount(bin1)) {
			bin1 = bin1 * 10;
		}
		System.out.println(bin1 + " " + bin2);

	}

	// main method
	public static void main(String[] args) {
		System.out.println("Enter the binary number ");
		swap(InputUtility.nextInteger());

	}
}
