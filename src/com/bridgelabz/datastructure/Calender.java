package com.bridgelabz.DataStructure;

import com.bridgelabz.dataStructure.utility.InputUtility;
import com.bridgelabz.dataStructure.utility.Utility;

/*********************************************************************
 * 
 * To display the calendar in calendar format
 * 
 * 
 * @author amresh kumar
 * @since 26-11-2019
 *
 **********************************************************************
 */
public class Calender {
	/**
	 * To calculate the day of the week
	 * 
	 * @param month --> integer
	 * @param day   --> integer
	 * @param year  -->integer
	 * @return integer
	 */
	public static int day(int month, int day, int year) {
		int actualYear = year - (14 - month) / 12;
		int x = actualYear + actualYear / 4 - actualYear / 100 + actualYear / 400;
		int actualMonth = month + 12 * ((14 - month) / 12) - 2;
		int dayStart = (day + x + (31 * actualMonth) / 12) % 7;
		return dayStart;
	}

	/********************************************************
	 * 
	 * to return true if the given year is a leap year
	 * 
	 * @param year -->integer
	 * @return boolean
	 * 
	 *         ******************************************************
	 */
	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0))
			return true;
		if (year % 400 == 0)
			return true;
		return false;
	}

	/*******************************************************************
	 * To show the calendar
	 * 
	 * @param month -->integer
	 * @param year  -->integer
	 * @return void
	 * 
	 *         *****************************************************************
	 */
	public static void ShowCalender(int month, int year) {

		// months[i] = name of month i
		String[] months = { "", // leave empty so that months[1] = "January"
				"January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
				"November", "December" };

		// days[i] = number of days in month i
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// check for leap year
		if (month == 2 && isLeapYear(year))
			days[month] = 29;

		// print calendar header
		System.out.println("   \t \t" + months[month] + " " + year);
		System.out.println(" \tS  \t M \tTu  \tW \tTh  \tF  \tS");

		// starting day
		int startingDay = day(month, 1, year);

		// print the calendar
		for (int dayCount = 0; dayCount < startingDay; dayCount++)
			System.out.print("   \t");
		for (int monthDayCount = 1; monthDayCount <= days[month]; monthDayCount++) {
			System.out.print(" \t" + monthDayCount);
			if (((monthDayCount + startingDay) % 7 == 0) || (monthDayCount == days[month]))
				System.out.println();
		}

	}

	public static void main(String[] args) {
		System.out.println("enter the month and year to see the calander");
		ShowCalender(InputUtility.nextInteger(), InputUtility.nextInteger());
	}

}
