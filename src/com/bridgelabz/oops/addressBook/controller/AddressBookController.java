package com.bridgelabz.addressBook.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.AddressBook.service.IServices;
import com.bridgelabz.addressBook.model.AddressModel;
import com.bridgelabz.oops.utility.InputUtility;
import com.bridgelabz.oops.utility.Utility;

/*************************************************************************************************
 * 
 * To Impelement all the method that is to be performed by the user to have in
 * Address book
 * 
 * @author Amresh Kumar
 * @since 5-12-2019
 *
 */
public class AddressBookController implements IServices {
	AddressModel modelObject = new AddressModel();
	static JSONArray ja = new JSONArray();
	static JSONObject jsonMainObj = new JSONObject();

	static AddressBookView AddressBookView_Object = new AddressBookView();

	/**********************************************************************************
	 * To open the file which the user want
	 * 
	 * @param FilePath --> String
	 * @return void
	 * 
	 *         ********************************************************************************
	 */
	@Override
	public void Open(String FilePath) {
		JSONParser jsonParser = new JSONParser();

		try {
			JSONObject object = (JSONObject) jsonParser.parse(new FileReader(FilePath));

			System.out.println(object.toJSONString());

			AddressBookView_Object.Choice(FilePath);// to call the openchoice() task with the existing file.

		} catch (Exception e) {
			System.out.println("***FILE NOT FOUND***"); // If file not found
			AddressBookView_Object.menu();
		}

	}

	/**
	 * To check If File exist's
	 * 
	 * @param FilePath --> String
	 * @return boolean
	 */
	@SuppressWarnings({ "resource", "unused" })
	public boolean isFile(String FilePath) {
		FileReader file;
		try {
			file = new FileReader(FilePath);
			return true;
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			return false;
		}

	}

	/**
	 * to close the file after the saves the file if want
	 * 
	 * @param filePath   --> string
	 * @param jsonObject --> JSONObject
	 * @return void
	 * 
	 */
	@Override
	public void Close(String filePath, JSONObject jsonObject) {
		System.out.println("To  save file type Y/y & for not saving file type N/n");
		char character = InputUtility.next().charAt(0);
		if (character == 'y' || character == 'Y') {
			Save(filePath);
		} else if (character == 'N' || character == 'n') {
			AddressBookView_Object.menu();
		} else {
			System.out.println("wrong input");
			AddressBookView_Object.menu(jsonObject, filePath); // redirecting to the main menu
		}

	}

	/**
	 * To call NewFile() to create the new file if user gave the correct input
	 * 
	 */
	public void New() {

		System.out.println("Enter the file name(use .json extension)");
		String Name = InputUtility.nextLine();
		if (isFile(Name))
			New(Name);
		else {
			System.out.println("File exist's try different name(use .json extension)");
			AddressBookView_Object.menu();
		}

	}

	/**
	 * to save the file
	 * 
	 * @param FilePath --> String
	 * @return void
	 */
	@Override
	public void Save(String FilePath) {

		try (FileWriter file = new FileWriter(FilePath)) {

			file.write(jsonMainObj.toJSONString());
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("successful");
		AddressBookView_Object.menu();

	}

	/******************************************************************************************
	 * 
	 * @overload of save method
	 *
	 *           To save the file with new name of the file which the user wants
	 * 
	 * @param next       --> String
	 * @param jsonObject --> JSONObject
	 * 
	 *                   ****************************************************************************************
	 */
	private void save(String next, JSONObject jsonObject) {

		try (FileWriter file = new FileWriter(next)) {

			file.write(jsonMainObj.toJSONString());
			file.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("successful");
		AddressBookView_Object.menu();

	}

	/**
	 * to create new file
	 * 
	 * @param fileName --> String
	 */
	public void New(String fileName) {
		try {

			JSONObject Object = new JSONObject();
			Files.write(Paths.get(fileName), Object.toJSONString().getBytes());
			System.out.println("Do you want to fill the addess book");
			System.out.println("Enter your choice: Y/N"); // Y for yes and N for No.
			char charachter = InputUtility.next().charAt(0);
			if (charachter == 'y' || charachter == 'Y') {
				AddressBookEntry(fileName);
			} else if (charachter == 'N' || charachter == 'n') {
				AddressBookView_Object.menu(Object, fileName);
			} else {
				System.out.println("wrong input");
				AddressBookView_Object.menu(); // redirecting to the main menu
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	/**
	 * to take input to the address book
	 * 
	 * @param FilePath
	 */
	@SuppressWarnings("unchecked")
	public void AddressBookEntry(String FilePath) {
		try {
			JSONObject Object = new JSONObject();
			System.out.println("Enter the first name  :");
			modelObject.setFirstName(InputUtility.next());
			Object.put("First Name", modelObject.getFirstName());
			System.out.println("Enter the last name  :");
			modelObject.setLastname(InputUtility.next());
			Object.put("Last Name", modelObject.getLastname());
			System.out.println("Enter the address :");
			modelObject.setAddress(InputUtility.next());
			Object.put("Address", modelObject.getAddress());
			System.out.println("Enter the state:");
			modelObject.setState(InputUtility.next());
			Object.put("State", modelObject.getState());
			System.out.println("Enter the city :");
			modelObject.setCity(InputUtility.next());
			Object.put("City", modelObject.getCity());
			System.out.println("Enter the zip :");
			modelObject.setZip(InputUtility.nextInteger());
			Object.put("Zip", modelObject.getZip());
			System.out.println("Enter the phone number :");
			modelObject.setMobileNumber(InputUtility.nextlong());
			Object.put("Phone Number", modelObject.getMobileNumber());

			ja.add(Object);

			jsonMainObj.put("address book", ja);

		} catch (Exception e) {
			e.getMessage();
		}
		AddressBookView_Object.menu(jsonMainObj, FilePath);// redirecting to the main menu

	}

	/**
	 * To take the option from the user for adding, opening and to exit from the
	 * program of the file;
	 * 
	 * @param choice --> Integer
	 * @return void
	 */
	public void option(int choice) {
		switch (choice) {
		case 1:
			System.out.println("Enter the file name (use .json extension)");
			New(InputUtility.next());

			break;

		case 2:
			System.out.println("Enter the file path");

			Open(InputUtility.next());
			break;

		case 3:

			System.out.println("*********THANK YOU*********");
			System.exit(0);
			break;

		default:
			System.out.println("wrong input");
			AddressBookView_Object.menu();
			break;
		}
	}

	/**
	 * To call the method as per the user choose the option from the view class menu
	 * method
	 * 
	 * @param nextInt    --> Integer
	 * @param jsonObject --> JSONObject
	 * @param filePath   --> String
	 */
	public void option(int nextInt, JSONObject jsonObject, String filePath) {

		switch (nextInt) {
		case 1:
			System.out.println("Save " + filePath + " before opening new file");

			AddressBookView_Object.menu(jsonObject, filePath);

			break;

		case 2:
			System.out.println("Save " + filePath + " before opening new file");

			AddressBookView_Object.menu(jsonObject, filePath);
			break;

		case 3:

			Close(filePath, jsonObject);
			break;

		case 4:

			Save(filePath);
			break;

		case 5:
			System.out.println("Enter the new file name");
			save(InputUtility.next(), jsonObject);
			break;

		case 6:
			System.out.println("do you want save file before quit Y/N");
			char charachter = InputUtility.next().charAt(0);
			if (charachter == 'y' || charachter == 'Y') {
				Save(filePath);
			} else if (charachter == 'N' || charachter == 'n') {
				AddressBookView_Object.menu();
			} else {
				System.out.println("wrong input");
				AddressBookView_Object.menu(jsonObject, filePath); // redirecting to the main menu
			}
			break;
		default:
			System.out.println("wrong input");
			AddressBookView_Object.menu();
			break;
		}
	}

	/**
	 * @overload of option method
	 * 
	 *           To call the method as per the user choose the option from the view
	 *           class menu method
	 * 
	 * @param option      --> Integer
	 * @param filePath --> String
	 */
	public void option(int option, String filePath) {

		switch (option) {
		case 1:
			AddressBookEntry(filePath);
			break;

		case 2:

			Delete(filePath);
			break;

		case 3:
			System.out.println("Do you want to save before going back Y/N");
			char charachter = InputUtility.next().charAt(0);
			if (charachter == 'y' || charachter == 'Y') {
				Save(filePath);
			} else if (charachter == 'N' || charachter == 'n') {
				AddressBookView_Object.menu();
			} else {
				System.out.println("wrong input");
				isFile(filePath); // redirecting to the main menu
			}

			break;

		default:
			System.out.println("***WRONG INPUT***");
			isFile(filePath);
			break;
		}
	}

	/**
	 * To delete the existing file
	 * 
	 * @param filePath --> String
	 * @return void
	 */
	public void Delete(String filePath) {

		File file = new File(filePath);
		if (file.delete())

			System.out.println(filePath + " deleted");

		else
			System.out.println("Failed");
		AddressBookView_Object.menu(); // redirect to the menu

	}

}
