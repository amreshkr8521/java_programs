package com.bridgelabz.basic;

import com.brdgelabz.utility.BasicProgramUtility;
import com.brdgelabz.utility.InputUtility;


/**
 * generate the table of power of 2 for given number
 * 
 * @author amresh kumar
 * @version 1.0
 */
public class PowerOfTwo {
	public static void main(String[] args) {

		System.out.println("Enter the number");
		BasicProgramUtility.powerOfTwo(InputUtility.nextInteger());
	}
}
