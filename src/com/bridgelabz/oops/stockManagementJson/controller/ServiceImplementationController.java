package com.bridegelabz.stockManagementJson.controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridegelabz.stockManagementJson.model.StockAccount;
import com.bridegelabz.stockManagementJson.model.StockModel;
import com.bridegelabz.stockManagementJson.service.IServices;
import com.bridgelabz.oops.utility.InputUtility;
import com.bridgelabz.oops.utility.Utility;

/*******************************************************************************************
 * 
 * Purpose : To implement all the method of the service class and to implement
 * it in this class. In stock their are shares which is of the company and no.
 * of share of company. the customer can buy the share of the company which is
 * investing in the company by buying the share and becime the share holder of
 * the company. the customer can sell his/her share any time when customer
 * wants.
 * 
 * @author Amresh Kumar
 * @since 18-12-2019
 * @version 1.1
 *
 ********************************************************************************************
 */
public class ServiceImplementationController implements IServices {
	StockModel stockModel = new StockModel();
	StockAccount stockAccount = new StockAccount();

	JSONObject rootObject = new JSONObject();

	/**
	 * Adding new company
	 */
	@SuppressWarnings("unchecked")
	public void addNew() {
		JSONObject jsonobject = new JSONObject();
		System.out.println("Enter the Name Of Company");
		stockModel.setNameOfCompany(InputUtility.next());
		jsonobject.put("NameOfCompany", stockModel.getNameOfCompany());
		System.out.println("Enter the price Of Share");
		stockModel.setNoOfShare(InputUtility.nextlong());
		jsonobject.put("priceOfShare", stockModel.getNoOfShare());
		System.out.println("Enter the no. Of Share");
		stockModel.setNoOfShare(InputUtility.nextlong());
		jsonobject.put("noOfShare", stockModel.getNoOfShare());
		System.out.println("Enter the logo");
		stockModel.setLogo(InputUtility.next());
		jsonobject.put("logo", stockModel.getLogo());
		jsonobject.put("transaction", "");
		rootObject.put(stockModel.getLogo(), jsonobject);
		Utility.writeToFile(rootObject, "StockJSON.json");
	}

	/**
	 * to show the logo of the company
	 */
	public void showLogo() {
		JSONParser jsonParser = new JSONParser();
		Object object;
		try {
			object = jsonParser.parse(new FileReader("StockJSON.json"));
			JSONObject jsonObject = (JSONObject) object;
			Set<?> set = jsonObject.keySet();
			Iterator<?> itr = set.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		} catch (FileNotFoundException e) {
			System.out.println("wrong logo");
		} catch (IOException e) {

			System.out.println("wrong logo");
		} catch (ParseException e) {
			System.out.println("wrong logo");
			e.printStackTrace();
		}

	}

	/*********************************************************************
	 * 
	 * To check if the particular symbol is present or not
	 * 
	 * @param symbol --> String
	 * @return boolean
	 * 
	 *         *******************************************************************
	 */
	public boolean IsPresent(String symbol) {
		JSONParser jsonParser = new JSONParser();
		Object object;
		try {
			object = jsonParser.parse(new FileReader("StockJSON.json"));
			JSONObject jsonObject = (JSONObject) object;
			Set<?> set = jsonObject.keySet();
			Iterator<?> itr = set.iterator();
			while (itr.hasNext()) {
				String Symbol = (String) itr.next();
				if (Symbol.equals(symbol))
					return true;
			}
		} catch (FileNotFoundException e) {
			System.out.println("wrong logo");
		} catch (IOException e) {

			System.out.println("wrong logo");
		} catch (ParseException e) {
			System.out.println("wrong logo");
			e.printStackTrace();
		}
		return false;
	}

	/****************************************************
	 * 
	 * To Add the new customer to the json file
	 * 
	 * @param string -->String
	 * 
	 *               **************************************************
	 */
	@SuppressWarnings("unchecked")
	public void addNew(String string) {
		JSONObject jsonobject = new JSONObject();
		System.out.println("Enter the name");
		stockAccount.setName(InputUtility.next());
		jsonobject.put("name", stockAccount.getName());
		jsonobject.put("companyName", null);
		jsonobject.put("amount", null);
		jsonobject.put("symbol", null);
		jsonobject.put("share", null);
		rootObject.put(stockAccount.getName(), jsonobject);
		Utility.writeToFile(rootObject, string);
	}

	/*******************************************************
	 * To buy the stock from the company and updating the account of customer and
	 * company
	 * 
	 * @param amount --> long
	 * @param symbol --> String
	 * 
	 *               *****************************************************
	 */
	public void buy(long amount, String symbol) {
		System.out.println("Enter your name");
		String customername = InputUtility.next();
		long stockAmount = updateCompany(customername, symbol, amount);
		updateAccount(customername, symbol, amount, stockAmount);
	}

	/***********************************************************************
	 * to check if the customer is present or not
	 * 
	 * @param name     --> String
	 * @param fileName --> String
	 * @return boolean
	 *         *********************************************************************
	 */
	private boolean IsName(String name, String fileName) {
		JSONParser jsonParser = new JSONParser();
		Object object;
		try {
			object = jsonParser.parse(new FileReader(fileName));
			JSONObject jsonObject = (JSONObject) object;
			Set<?> set = jsonObject.keySet();
			Iterator<?> itr = set.iterator();
			while (itr.hasNext()) {
				String Symbol = (String) itr.next();
				if (Symbol.equals(name))
					return true;
			}
		} catch (FileNotFoundException e) {
			System.out.println("wrong logo");
		} catch (IOException e) {

			System.out.println("wrong logo");
		} catch (ParseException e) {
			System.out.println("wrong logo");
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * To update the stock
	 */
	@SuppressWarnings("unchecked")
	public void updateStock() {
		System.out.println("*****Company logo*****");
		showLogo();
		System.out.println("**********************");
		System.out.println();
		System.out.println("Which company you want to update");
		String name = InputUtility.next();
		if (IsName(name, "StockJSON.json")) {
			JSONParser jsonParser = new JSONParser();
			Object object;
			try {
				object = jsonParser.parse(new FileReader("StockJSON.json"));
				JSONObject jsonObject = (JSONObject) object;
				Set<?> set = jsonObject.keySet();
				Iterator<?> itr = set.iterator();
				while (itr.hasNext()) {
					String Logo = (String) itr.next();
					System.out.println(Logo);
					if (Logo.equals(name)) {
						JSONObject newObject = (JSONObject) jsonObject.get(name);
						System.out.println(newObject.toJSONString());
						stockModel.setLogo(name);
						System.out.println("Enter the price Of Share");
						stockModel.setPriceOfShare(InputUtility.nextlong());
						System.out.println("Enter the no Of Share");
						stockModel.setNoOfShare(InputUtility.nextlong());
						System.out.println(stockModel.getPriceOfShare());
						newObject.replace("priceOfShare", stockModel.getPriceOfShare());
						newObject.replace("noOfShare", stockModel.getNoOfShare());
						jsonObject.put(stockModel.getLogo(), newObject);
						Utility.writeToFile(jsonObject, "StockJSON.json");
					}
				}
			} catch (FileNotFoundException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			} catch (ParseException e) {

				e.printStackTrace();
			}
		} else {
			System.out.println("wrong input");
			System.out.println("*********************************");
			System.out.println();
			updateStock();
		}
	}

	/**
	 * To update the company after the buy or sell is done.
	 * 
	 * @param customername --> String
	 * @param symbol       --> String
	 * @param amount       --> long
	 * @return --> long
	 */
	@SuppressWarnings("unchecked")
	public long updateCompany(String customername, String symbol, long amount) {
		System.out.println("amount= " + amount);
		if (IsName(customername, "StockAccount.json")) {

			JSONParser jsonParser = new JSONParser();
			Object object;
			try {
				object = jsonParser.parse(new FileReader("StockJSON.json"));
				JSONObject jsonobject = (JSONObject) object;
				Set<?> set = jsonobject.keySet();
				Iterator<?> iterator = set.iterator();
				while (iterator.hasNext()) {
					String CompanyLogo = (String) iterator.next();
					if (CompanyLogo.equals(symbol)) {
						JSONObject newJsonObject = (JSONObject) jsonobject.get(symbol);
						stockModel.setLogo(symbol);
						stockModel.setNameOfCompany((String) newJsonObject.get("NameOfCompany"));
						LocalDateTime dateAndTime = LocalDateTime.now();
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
						String date = dateAndTime.format(formatter);
						newJsonObject.replace("transaction", date);
						long noOfShare = (long) newJsonObject.get("noOfShare");
						if (amount > 0)
							noOfShare = noOfShare - amount;
						else
							noOfShare = noOfShare + amount;
						System.out.println(" share== " + noOfShare);
						newJsonObject.put("noOfShare", noOfShare);
						rootObject.put(stockModel.getLogo(), newJsonObject);
						Utility.writeToFile(rootObject, "StockJSON.json");
						long price = (long) newJsonObject.get("priceOfShare");
						System.out.println(price);
						return price;
					}
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	/******************************************************************************
	 * to update the account of the customer after buy or sell is made
	 * 
	 * @param customername --> String
	 * @param symbol       --> String
	 * @param amount       --> long
	 * @param stockAmount  --> long
	 * 
	 *                     *****************************************************************************
	 */
	@SuppressWarnings("unchecked")
	public void updateAccount(String customername, String symbol, long amount, long stockAmount) {
		JSONParser jsonParser = new JSONParser();
		Object object;
		System.out.println("root= ---" + rootObject.toJSONString());
		try {
			JSONObject jobject = new JSONObject();
			object = jsonParser.parse(new FileReader("StockAccount.json"));
			JSONObject jsonobject = (JSONObject) object;
			Set<?> set = jsonobject.keySet();
			Iterator<?> iterator = set.iterator();
			while (iterator.hasNext()) {
				String name = (String) iterator.next();
				if (name.equals(customername)) {
					JSONObject newJsonObject = (JSONObject) jsonobject.get(customername);
					newJsonObject.put("symbol", stockModel.getLogo());
					newJsonObject.put("companyName", stockModel.getNameOfCompany());
					if (amount > 0) {
						newJsonObject.put("share", amount);
						newJsonObject.put("amount", (stockAmount * amount));
					} else {
						long share = (long) newJsonObject.get("share");
						share = share + amount;
						newJsonObject.put("share", share);
						newJsonObject.put("amount", (int) (stockAmount * -(amount)));
					}
					jobject.put(customername, newJsonObject);
					Utility.writeToFile(jobject, "StockAccount.json");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	/**************************************************************************
	 * to check if the particular stock is present or not
	 * 
	 * @param stock  --> long
	 * @param string --> String
	 * @param name   --> String
	 * @return --> boolean
	 *         ************************************************************************
	 */
	public boolean IsStock(long stock, String string, String name) {
		JSONParser jsonParser = new JSONParser();
		Object object;
		try {
			object = jsonParser.parse(new FileReader(string));
			JSONObject jsonObject = (JSONObject) object;
			Set<?> set = jsonObject.keySet();
			Iterator<?> iterator = set.iterator();
			while (iterator.hasNext()) {
				String CustomerName = (String) iterator.next();
				if (CustomerName.equals(name)) {
					JSONObject stockJSON = (JSONObject) jsonObject.get(name);
					stockModel.setNoOfShare((long) stockJSON.get("share"));
					long Availablestock = stockModel.getNoOfShare();
					System.out.println();
					if (stock > Availablestock) {
						System.out.println("Not Enough Stock");
						return false;
					}
				}
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ParseException e) {

			e.printStackTrace();
		}
		return true;
	}

	/******************************************
	 * to make a sell by the customer
	 * 
	 * @param amount --> long
	 * @param symbol --> String ****************************************
	 */
	@Override
	public void sell(long amount, String symbol) {
		System.out.println("Enter your name");
		String customername = InputUtility.next();
		long stockAmount = updateCompany(customername, symbol, -amount);
		updateAccount(customername, symbol, -amount, stockAmount);
	}

	/**
	 * To print the report of the consumer
	 */
	@Override
	public void printReport() {
		JSONParser jsonParser = new JSONParser();
		Object object;
		try {
			object = jsonParser.parse(new FileReader("StockAccount.json"));
			JSONObject jsonObject = (JSONObject) object;
			Set<?> set = jsonObject.keySet();
			Iterator<?> itr = set.iterator();
			System.out.println("*******************");
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			System.out.println("wrong name");
		} catch (IOException e) {
			System.out.println("wrong name");
		} catch (ParseException e) {
			System.out.println("wrong name");
			e.printStackTrace();
		}
		System.out.println("Enter your name");
		String name = InputUtility.next();
		try {
			object = jsonParser.parse(new FileReader("StockAccount.json"));
			JSONObject jsonObject = (JSONObject) object;
			Set<?> set = jsonObject.keySet();
			Iterator<?> iterator = set.iterator();
			while (iterator.hasNext()) {
				String nameOfCustomer = (String) iterator.next();
				if (nameOfCustomer.equals(name)) {
					JSONObject customerJSON = (JSONObject) jsonObject.get(name);
					stockAccount.setAmount((long) customerJSON.get("amount"));
					stockAccount.setCompanyName((String) customerJSON.get("companyName"));
					stockAccount.setName(name);
					stockAccount.setShare((long) customerJSON.get("share"));
					stockAccount.setSymbol((String) customerJSON.get("symbol"));
					System.out.println("Name \t\t=" + stockAccount.getName());
					System.out.println("Company Name \t=" + stockAccount.getCompanyName());
					System.out.println("Share \t\t=" + stockAccount.getShare());
					System.out.println("Total amount \t=" + stockAccount.getAmount());
					System.out.println();
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
