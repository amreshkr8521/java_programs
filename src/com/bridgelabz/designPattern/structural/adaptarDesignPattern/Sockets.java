package com.bridgelabz.structural.adaptarDesignPattern;

/**
 * To get the new object of Volt
 * 
 * @author amresh kumar
 *
 */
public class Sockets {
	public Volt getVolt() {
		return new Volt(120);// return the Volt object
	}
}
