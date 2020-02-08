package com.bridgelabz.creational.prototypeDesignPattern;

import java.util.List;
import java.util.Scanner;

/*************************************************************************************************************
 * Empolyee factory class to access the Employee class and make clone object of
 * the employee class
 * 
 * @author Amresh kumar
 * @since 9-12-2019
 *
 ***********************************************************************************************************
 */
public class EmpolyeeFactory {
	static Scanner scanner = new Scanner(System.in);

	// main method
	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		for (int count = 0; count < 3; count++)
			emps.loadInput();

		// Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmployeeList();
		System.out
				.println("Enter the name of new employee which is cloned first and new name is stored in cloned list");
		list.add(scanner.next());
		List<String> list1 = empsNew1.getEmployeeList();
		System.out.println("Enter the name of new employee which is to be removed ");
		list1.remove(scanner.next());

		System.out.println("emps List: " + emps.getEmployeeList());
		System.out.println("empsNew List: " + list);
		System.out.println("empsNew1 List: " + list1);
	}

}
