package com.brdgelabz.utility;

/**
 * Contain the method for the logical program
 * 
 * @author amresh kumar
 *
 */
public class LogicalUtility {

	public static int collect(int n) {
		boolean[] isCollected = new boolean[n]; // isCollected[i] = true if card type i already collected
		int count = 0; // number of cards collected
		int distinct = 0; // number of distinct card types collected

		// repeat until you've collected all n card types
		while (distinct < n) {
			int value = (int) (Math.random() * n); // pick a random card
			count++; // one more card
			if (!isCollected[value]) { // discovered a new card type
				distinct++;
				isCollected[value] = true;
			}
		}
		return count;
	}
}
