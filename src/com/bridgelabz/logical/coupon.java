package com.bridgelabz.logical;

import com.brdgelabz.utility.InputUtility;

/**
 * To generate the distinct number of coupon
 * 
 * @author amresh kumar
 *
 */
public class coupon {

	// return a random coupon between 0 and n-1
	public static int getCoupon(int n) {
		return (int) (Math.random() * n);
	}

	/**
	 * To get the distinct number of coupon in random so that all are diffrent.
	 * 
	 * @param numberOfDistinctCoupon
	 * @return int
	 */
	public static int collect(int numberOfDistinctCoupon) {
		boolean[] isCollected = new boolean[numberOfDistinctCoupon]; // isCollected[i] = true if card type i already
																		// collected
		int count = 0; // number of cards collected
		int distinct = 0; // number of distinct card types collected

		// repeat until you've collected all n card types
		while (distinct < numberOfDistinctCoupon) {
			int value = getCoupon(numberOfDistinctCoupon); // pick a random card
			count++; // one more card
			if (!isCollected[value]) { // discovered a new card type
				distinct++;
				isCollected[value] = true;
			}
		}
		return count;
	}

	// test client
	public static void main(String[] args) {

		System.out.println("Enter the number");
		int numberOfDistinctCoupon = InputUtility.nextInteger();
		int coupon = collect(numberOfDistinctCoupon);
		System.out.println(coupon);
	}
}
