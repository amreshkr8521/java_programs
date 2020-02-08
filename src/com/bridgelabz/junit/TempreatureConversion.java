package com.bridgelabz.junit;

import com.brdgelabz.utility.InputUtility;

/**
 * To convert temperature from Celsius to Fahrenheit and vice versa.
 * 
 * @author amresh kumar
 * @modified
 * @version 1.0
 * 
 */

public class TempreatureConversion {

	/**
	 * convert celsius to fahrenheit
	 */
	static void toFahrenheit() {
		System.out.println("Celsius = ");
		int celsius = InputUtility.nextInteger();
		int fahrenheit = (celsius * 9 / 5) + 32;
		System.out.println(celsius + " = " + fahrenheit);
	}

	/**
	 * convert fahrenheit to celsius no parameter no return type
	 */
	static void toCelsius() {
		System.out.println("fahrenheit = ");
		int fahrenheit = InputUtility.nextInteger();
		int celsius = (fahrenheit * 9 / 5) + 32;
		System.out.println(fahrenheit + " = " + celsius);
	}

	/**
	 * To call toCelsius and toFahrenheit method
	 *
	 */
	static void temperatureConversion() {
		System.out.println("choose your option");
		System.out.println("1 : celsius to fahernheit");
		System.out.println("2 : fahernheit to celsius");
		int option = InputUtility.nextInteger();
		if (option == 1) {
			toFahrenheit();
		} else if (option == 2) {
			toCelsius();
		}
	}

	public static void main(String[] args) {
		temperatureConversion();
	}
}
