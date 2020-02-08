package com.bridgelabz.creational.prototypeDesignPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/****************************************************************************************
 * 
 * To add empolyee name and store them in a list and clone the list whenever it
 * is used
 * 
 * @author Amresh Kumar
 * @since 6-12-2019
 * @version 1.0
 *
 ****************************************************************************************
 */
public class Employees implements Cloneable {
	Scanner scanner = new Scanner(System.in);
	private List<String> employeeList;

//constructor without parameter  
	public Employees() {
		employeeList = new ArrayList<String>();
	}

//constructor with parameter
	public Employees(List<String> list) {
		this.employeeList = list;
	}

//to take input
	public void loadInput() {
		System.out.println("Enter the name of the employee");
		employeeList.add(scanner.next());
	}

//to get employeeList
	public List<String> getEmployeeList() {
		return employeeList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String s : this.getEmployeeList()) {
			temp.add(s);
		}
		return new Employees(temp);
	}
}
