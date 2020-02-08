package com.bridgelabz.structural.adaptarDesignPattern;

import java.util.Scanner;

/**
 * Runner class to run all the implementation of Socket
 * 
 * @author Amresh Kumar
 * @since 10-12-2019
 *
 */
public class AdapterPatternRunner {
	static Scanner scanner = new Scanner(System.in);

	// main class
	public static void main(String[] args) {

		testClassAdapter();
		testObjectAdapter();
	}

	private static void testObjectAdapter() {
		AdapterDesignPaternServices sockAdapter = new SocketObjectAdapterImplementation();
		System.out.println("Enter three volts");
		Volt v3 = getVolt(sockAdapter, scanner.nextInt());
		Volt v12 = getVolt(sockAdapter, scanner.nextInt());
		Volt v120 = getVolt(sockAdapter, scanner.nextInt());
		System.out.println("v3 volts using Object Adapter=" + v3.getVolts());
		System.out.println("v12 volts using Object Adapter=" + v12.getVolts());
		System.out.println("v120 volts using Object Adapter=" + v120.getVolts());
	}

	private static void testClassAdapter() {
		AdapterDesignPaternServices sockAdapter = new SocketClassAdapterImplimentation();
		System.out.println("Enter three volts");
		Volt v3 = getVolt(sockAdapter, scanner.nextInt());
		Volt v12 = getVolt(sockAdapter, scanner.nextInt());
		Volt v120 = getVolt(sockAdapter, scanner.nextInt());
		System.out.println("v3 volts using Class Adapter=" + v3.getVolts());
		System.out.println("v12 volts using Class Adapter=" + v12.getVolts());
		System.out.println("v120 volts using Class Adapter=" + v120.getVolts());
	}

	private static Volt getVolt(AdapterDesignPaternServices sockAdapter, int i) {
		switch (i) {
		case 3:
			return sockAdapter.get3volt();
		case 12:
			return sockAdapter.get12volt();
		case 120:
			return sockAdapter.get120volt();
		default:
			return sockAdapter.get120volt();
		}
	}

}
