package com.bridgelabz.basic;

import com.brdgelabz.utility.BasicProgramUtility;
import com.brdgelabz.utility.InputUtility;


/**
 * To generate the harmonic number
 * 
 * @author amresh kumar
 * @version 1.0
 */
public class HarmonicNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		System.out.println("\n harmonic number = " + BasicProgramUtility.harmonicNumbers(InputUtility.nextInteger()));
	}
}
