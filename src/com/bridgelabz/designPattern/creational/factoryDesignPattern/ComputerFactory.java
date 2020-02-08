package com.bridgelabz.creational.factoryDesignPattern;

import java.util.Scanner;

/**
 * factory class for the computer to get the instance of server or PC or laptop
 * 
 * @author amresh kumar
 *
 */
public class ComputerFactory {
	private static String HDD;
	private static String RAM;
	private static String CPU;

	static Scanner scanner = new Scanner(System.in);

	/**
	 * To return the instance according to the user need
	 * 
	 * @param type String
	 * @param RAM  String
	 * @param HDD  String
	 * @param CPU  String
	 * @return Computer
	 */
	public static Computer getInstance(String type, String RAM, String HDD, String CPU) {
		if ("Laptop".equalsIgnoreCase(type))
			return new Laptop(RAM, HDD, CPU);
		else if ("PC".equalsIgnoreCase(type)) {
			return new PC(RAM, HDD, CPU);

		} else if ("Server".equalsIgnoreCase(type))
			return new Server(RAM, HDD, CPU);

		else
			return null;
	}

}
