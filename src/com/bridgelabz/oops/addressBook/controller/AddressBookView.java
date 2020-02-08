package com.bridgelabz.addressBook.controller;

import org.json.simple.JSONObject;

import com.bridgelabz.oops.utility.InputUtility;
import com.bridgelabz.oops.utility.Utility;

/**
 * THis class is for the user intraction to make them use the option that are
 * provided to them
 * 
 * @author Amresh Kumar
 * @since 5-12-2019
 *
 */
public class AddressBookView {
	static AddressBookController addressBookController_Object = new AddressBookController();
	static AddressBookView addressBookView_MainObject = new AddressBookView();

	/**
	 * It gives option to the user when there is no file to operate with
	 * 
	 */
	public void menu() {
		System.out.println("Enter the choice");
		System.out.println("1 :new");
		System.out.println("2 :Open");
		System.out.println("3 :Quit");
		addressBookController_Object.option(InputUtility.nextInteger());
	}

	/**
	 * It gives option to the user when there is file to operate with
	 * 
	 * @param jsonObject -->JSONObject
	 * @param FilePath   -->String
	 */
	public void menu(JSONObject jsonObject, String FilePath) {
		System.out.println("Enter the choice");
		System.out.println("1 :new");
		System.out.println("2 :Open");
		System.out.println("3 :close");
		System.out.println("4 :save");
		System.out.println("5 :SaveAs");
		System.out.println("6 :Quit");
		addressBookController_Object.option(InputUtility.nextInteger(), jsonObject, FilePath);
	}

	/**
	 * 
	 * @param FilePath -->String
	 */
	public void Choice(String FilePath) {
		System.out.println("Enter your choice");

		System.out.println("1 : add");
		System.out.println("2 : delete");

		System.out.println("3 : home");
		addressBookController_Object.option(InputUtility.nextInteger(), FilePath);

	}

	// main method.
	public static void main(String[] args) {
		addressBookView_MainObject.menu();
	}
}
