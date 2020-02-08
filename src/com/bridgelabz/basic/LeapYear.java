package com.bridgelabz.basic;

import com.brdgelabz.utility.BasicProgramUtility;
import com.brdgelabz.utility.InputUtility;


/**
 * To check if the given year is leap or not
 * 
 * @author amresh kumar
 * @version 1.0
 */
public class LeapYear {
	public static void main(String[] args) {
		System.out.println("Enter the year you want to check");
		if (BasicProgramUtility.isLeapYear(InputUtility.nextInteger()))
			System.out.println("It's a leap year");
		else
			System.out.println("It's not a leap year ");
	}
}
