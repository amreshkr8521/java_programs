package com.bridgelabz.junit;

import com.brdgelabz.utility.InputUtility;
import com.brdgelabz.utility.JunitUtility;

/**
 * To determine the Day Of The Week
 * 
 * @author amresh kumar
 * @version 1.0
 * 
 */
public class DaysOfWeek {
	public static void main(String[] args) {
		System.out.println("Enter the month :");
		int month = InputUtility.nextInteger();
		System.out.println("Enter the year :");
		int year = InputUtility.nextInteger();
		System.out.println("Enter the day :");
		int day = InputUtility.nextInteger();
		System.out.println(JunitUtility.dayOfWeek(month, year, day));
	}
}
