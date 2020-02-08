package com.bridgelabz.junit;

import com.brdgelabz.utility.InputUtility;
import com.brdgelabz.utility.JunitUtility;

/**
 * to find the monthaly payment of a person
 * 
 * @author amresh kumar
 * @version 1.0
 */
public class MonthalyPayment {
	public static void main(String[] args) {
		System.out.println("Enter the principal , rate and year");
		System.out.println(JunitUtility.monthlyPayment(InputUtility.nextInteger(), InputUtility.nextInteger(),
				InputUtility.nextInteger()));
	}
}
