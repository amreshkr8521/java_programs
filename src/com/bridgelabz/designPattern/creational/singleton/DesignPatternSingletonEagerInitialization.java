package com.bridgelabz.creational.singleton;

/**
 * Creating the singleton class using Eager Initialization method
 * 
 * @author Amresh kumar
 * @since 9-12-2019
 *
 */
public class DesignPatternSingletonEagerInitialization {

	// Instance of the DesignPatternSingletonEagerInitialization class created
	private final static DesignPatternSingletonEagerInitialization DesignPatternSingletonEagerInitializationInstance = new DesignPatternSingletonEagerInitialization();
	private static String messege = "";

	public static String getDesignpatternsingletonMessege() {
		return messege;
	}

	public static void setDesignpatternsingletonMessege(String MessegeSend) {
		messege = MessegeSend;
	}

//Method to get the instance of DesignPatternSingletonEagerInitialization class from the outer of the class
	public static DesignPatternSingletonEagerInitialization getInstanceOfDesignPatternSingletonEagerInitialization() {
		return DesignPatternSingletonEagerInitializationInstance;
	}
}
