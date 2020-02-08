package com.bridgelabz.inventory.model;

/**************************************************
 * 
 * Inventory model of the inventory
 * 
 * @author Amresh Kumar
 * @since 16-12-2019
 **************************************************
 */
public class Inventory {
	private String name;
	private long price;
	private double weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Inventory(String name, long price, double weight) {
		this.name = name;
		this.price = price;
		this.weight = weight;
	}

	public Inventory() {
	}
}
