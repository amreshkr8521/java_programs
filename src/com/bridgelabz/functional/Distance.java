package com.bridgelabz.functional;

import com.brdgelabz.utility.FunctionalUtility;
import com.brdgelabz.utility.InputUtility;

/**
 * To find the distance between the (x,y) coordinate and (0,0) coordinate
 * 
 * @author amresh kumar
 * @since 19-11-2019
 * @version 1.0
 *
 */
public class Distance {
	public static void main(String[] args) {
		System.out.println("Enter the value for X and Y co-ordinate");
		FunctionalUtility.distance(InputUtility.nextInteger(), InputUtility.nextInteger());
	}
}
