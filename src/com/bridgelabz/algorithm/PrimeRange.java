package com.bridgelabz.algorithm;

import com.brdgelabz.utility.AlgorithmUtility;
import com.brdgelabz.utility.InputUtility;

/**
 * To prime nuber in range
 * 
 * @author amresh kumar
 *
 */
public class PrimeRange {
	public static void main(String[] args) {
		System.out.println("Enter the number till you want the prme range");
		AlgorithmUtility.primeRange(InputUtility.nextInteger());
	}
}
