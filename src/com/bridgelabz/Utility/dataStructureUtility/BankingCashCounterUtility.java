package com.bridgelabz.dataStructure.utility;


/**
 * Banking Cash Counter where people � come in to deposit Cash and withdraw cash
 *
 * @author amresh kumar
 *
 */
public class BankingCashCounterUtility {

	static Queue queue = new Queue<Integer>();

	/***************************************************************************************************
	 * 
	 * To make the user to choose the option and act as per the options
	 * 
	 * @param null
	 * @return void
	 * 
	 **************************************************************************************************
	 */
	public static void banking() {
		BankingCashCounterUtility bankingCashCounter = new BankingCashCounterUtility();
		System.out.println("**********************************************");
		System.out.println("Enter your option");
		System.out.println("1 : Deposit money");
		System.out.println("2 : Withdraw money");
		System.out.println("3 : Check balance");
		System.out.println("4 : Exit");
		System.out.println("**********************************************");
		bankingCashCounter.bankingCashCounter((InputUtility.nextInteger()));
	}

	/**
	 * According to the option given by the use task is performed
	 * 
	 * @param option
	 */
	public void bankingCashCounter(int option) {
		switch (option) {
		case 1:
			System.out.println("Enter the money= ");
			queue.enqueue(InputUtility.next());// to deposit the money

			banking();
			break;

		case 2:
			System.out.println("Enter the money= ");

			queue.dequeue(InputUtility.nextInteger()); // to withdraw the money
			banking();
			break;

		case 3:
			queue.show(); // show the balance
			banking();
			break;
		case 4:
			System.out.println("thank you "); // exit
			break;

		}

	}

}
