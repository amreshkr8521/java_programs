package com.bridgelabz.basic;

import com.brdgelabz.utility.BasicProgramUtility;
import com.brdgelabz.utility.InputUtility;


/**
 * To flip the coin number of time user wants and see the percent of head and
 * tail
 * 
 * @author amresh kumar
 * @version 1.0
 */
public class FlipCoin {
	public static void main(String[] args) {
		System.out.println("Enter the number of time you want to flip the coin");
		BasicProgramUtility.flipCoin(InputUtility.nextInteger());
	}
}
