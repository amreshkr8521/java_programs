package com.bridgelabz.logical;

import com.brdgelabz.utility.InputUtility;

/**
 * A Program to calculate the time interval and show the user. It act as the
 * Stopwatch
 * 
 * @author amresh kumar
 * @since 14-11-2019
 * @version 1.0
 * 
 */

public class StopWatch {
	static long start, time;

	// constructor of StoWatch class to start the timer at the time of object
	// creation
	public StopWatch() // throws exception
	{
		System.out.println("Timer started");

		// calling currentTimeMillis() from System package to return current time in
		// millisecond
		start = System.currentTimeMillis();

	}

	// To stop the timer which started at the time of object creation
	static void stop() {
		// calling currentTimeMillis() from System package to return current time in
		// millisecond
		time = System.currentTimeMillis();

		// showing time elapsed
		System.out.println((time - start) / 1000L + "sec");

	}
	//main method
	public static void main(String[] args) {
		try {
			StopWatch stopwatch = new StopWatch();

			System.out.println("do yo want to stop your timer");
			System.out.println("choose 1 to stop");
			int stopTrigger = InputUtility.nextInteger();
			if (stopTrigger == 1)
				stopwatch.stop();
		} catch (Exception e) {
			System.out.println("something went wrong");
			e.getStackTrace();
		}

	}

}
