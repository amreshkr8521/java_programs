package com.bridgelabz.functional;

import com.brdgelabz.utility.FunctionalUtility;
import com.brdgelabz.utility.InputUtility;

/****************************************************************************************
 * To determine the effective temperature of an area at a given temperature and
 * velocity
 * 
 * @author amresh kumar
 * @since 19-11-2019
 * @version 1.0
 * 
 ****************************************************************************************
 */
public class WindChill {
	public static void main(String[] args) {
		System.out.println("Enter the temperature");
		int temp = InputUtility.nextInteger(); // temperature input
		System.out.println("Enter the velocity");
		int velocity = InputUtility.nextInteger(); // velocity input
		System.out.println(FunctionalUtility.windChill(temp, velocity)); // calling windChill() and printing the value
	}
}
