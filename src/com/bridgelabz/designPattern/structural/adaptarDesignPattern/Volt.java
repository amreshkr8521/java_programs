package com.bridgelabz.structural.adaptarDesignPattern;

/**
 * This class is used to set the volts
 * 
 * @author Amresh Kumar
 * @since 10-12-2019
 *
 */
public class Volt {

	private int volts;

	/**
	 * parametrized constructor of this class
	 * 
	 * @param v --> integer
	 */
	public Volt(int v) {
		this.volts = v;
	}

	/**
	 * getter class to get the volt
	 * 
	 * @return integer
	 */
	public int getVolts() {
		return volts;
	}

	/**
	 * To set the volt
	 * 
	 * @param volts --> Integer
	 * @return void
	 */
	public void setVolts(int volts) {
		this.volts = volts;
	}
}
