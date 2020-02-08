package com.bridgelabz.creational.factoryDesignPattern;

/**
 * abstract class so that the class which extends it implement the methods
 * 
 * @author amresh kumar
 *
 */
public abstract class Computer {

	public abstract String getHDD();

	public abstract String getRAM();

	public abstract String getCPU();

	@Override
	public String toString() {
		return "RAM = " + this.getRAM() + "GB HDD = " + this.getHDD() + "GB CPU = " + this.getCPU() + "Gz";
	}

}
