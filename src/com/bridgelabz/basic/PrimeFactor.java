package com.bridgelabz.basic;

import com.brdgelabz.utility.BasicProgramUtility;
import com.brdgelabz.utility.InputUtility;


/**
 * To show the prime factor of the given number
 * 
 * @author amresh kumar
 * @version 1.0
 */
public class PrimeFactor {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		BasicProgramUtility.primeFactor(InputUtility.nextInteger());
	}
}
