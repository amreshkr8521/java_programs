package com.bridgelabz.junit;

import com.brdgelabz.utility.InputUtility;
import com.brdgelabz.utility.JunitUtility;

/**
 * To convert the number to binary
 * 
 * @author amresh kumar
 *
 */
public class ToBinary {
	public static void main(String[] args) {
		System.out.println("Enter the number you want to convert to binary");
		System.out.println(JunitUtility.toBinary(InputUtility.nextInteger()));
	}
}
