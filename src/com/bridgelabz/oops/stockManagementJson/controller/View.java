package com.bridegelabz.stockManagementJson.controller;
import java.util.Scanner;
/*************************************************************************
 * This class is for the user to use the Stock application method
 * 
 * @author Amresh Kumar
 * @since  18-12-2019
 * ***********************************************************************
 */
public class View {
public static	Scanner scanner=new Scanner(System.in);
ServiceImplementationController controllerObject=new ServiceImplementationController();
/**
 * main menu where the application begins
 */
public void mainMenu() {	
	System.out.println("******Home*******");
	System.out.println();
	System.out.println("Option :");
	System.out.println("1 : company");
	System.out.println("2 : customer");
	System.out.println("3 : exit");
	switch(scanner.nextInt()) {
	case 1:companyMenu();
		break;
	case 2:
		menu();
		mainMenu();
		break;
	case 3:
		System.out.println("****THANK**YOU****");
		System.exit(0);
		break;
	default :
		System.out.println("Wrong input");
		mainMenu();
		break;
	}
}
/**
 * menu for the company
 */
private void companyMenu() {
	System.out.println("options");
	System.out.println("1 : add");
	System.out.println("2 : update");
	System.out.println("3 : home");
	switch(scanner.nextInt()) {
	case 1:
		controllerObject.addNew();
		System.out.println();
		System.out.println("Updated");
		System.out.println();
		companyMenu();
		break;
	case 2:
		controllerObject.updateStock();
		System.out.println();
		System.out.println("Updated");
		System.out.println();
		companyMenu();
		break;
	case 3:
		mainMenu();
		break;
		default :
			System.out.println("Wrong Input");
			companyMenu();		
	}
}
/**
 * menu for the customer
 */
public void menu() {
	System.out.println("**********Stock**********");
	System.out.println("1 : buy");
	System.out.println("2 : sell");
	System.out.println("3 : add new customer");
	System.out.println("4 : Report");
	System.out.println("5 : home");
	option(scanner.nextInt());
}
/**
 * option made by the customer is procced
 * 
 * @param option --> Integer
 */
private void option(int option) {
	switch(option) {
	case 1:
		controllerObject.showLogo();
		System.out.println("Enter the symbol");
		String symbol=scanner.next();
		if(controllerObject.IsPresent(symbol)) {
		System.out.println("Enter the number of stock you want to buy");
		controllerObject.buy(scanner.nextInt(), symbol);
		}
		else {
			System.out.println("Wrong Input");
			option(option);}
		break;
	case 2:
		controllerObject.showLogo();
		System.out.println("Enter the symbol");
		String companySymbol=scanner.next();
		if(controllerObject.IsPresent(companySymbol)) {
			System.out.println("Enter your name");
			String name=scanner.next();
		System.out.println("Enter the number of stock you want to sell");
		long amount=scanner.nextLong();
		if(controllerObject.IsStock(amount,"StockAccount.json",name)) {
			controllerObject.sell(amount, companySymbol);
		}
		}
		else {
			System.out.println("Wrong Input");
			option(option);}
		
		break;
	case 3:
		controllerObject.addNew("StockAccount.json");
		menu();
		break;
	case 4:
		controllerObject.printReport();
		break;
	case 5:
		mainMenu();
		break;
	default :
		menu();
		break;
	}	
}
//main method
public static void main(String[] args) {	
	View view=new View();
	view.mainMenu();
}
}
