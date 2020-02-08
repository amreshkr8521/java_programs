package com.bridgelabz.functional;

import com.brdgelabz.utility.FunctionalUtility;
import com.brdgelabz.utility.InputUtility;

/**
 * To find three number in a array to determine that the sum of all three number
 * should be Zero
 * 
 * @author amresh kumar
 * @since 19-11-2019
 * @version 1.0
 *
 */
public class AddsZero {
	public static void main(String[] args) {
		System.out.println("Enter the number of number you want");
		int num = InputUtility.nextInteger();
		int array[] = new int[num];
		System.out.println("Enter the numbers");
		for (int count = 0; count < num; count++) {
			array[count] = InputUtility.nextInteger();
		}
		FunctionalUtility.addsZero(array);
	}
}
