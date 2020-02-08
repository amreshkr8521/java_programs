package com.bridgelabz.junit;

import com.brdgelabz.utility.InputUtility;
import com.brdgelabz.utility.JunitUtility;

/**
 * to generate the square root of a number
 * 
 * @author amresh kumar
 * @version 1.0
 */
public class SquareRoot {
	public static void main(String[] args) {
		System.out.println("enter the number you want to find the square root");
		System.out.println(JunitUtility.squreRoot(InputUtility.nextInteger()));
	}
}
