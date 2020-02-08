package com.bridgelabz.junit;

import com.brdgelabz.utility.InputUtility;
import com.brdgelabz.utility.JunitUtility;

/**
 * to get the number of notes from the vending machine as per the amount given
 * to it
 * 
 * @author amresh kumar
 * @version 1.0
 */
public class VendingMachine {
	public static void main(String[] args) {
		System.out.println("enter the money you want from the Vending Machine");
		JunitUtility.notes(InputUtility.nextInteger());
	}
}
