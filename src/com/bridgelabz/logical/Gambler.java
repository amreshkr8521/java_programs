package com.blab.amresh;

import java.util.Random;

/**
 * Simulates a gambler who start with $stake and place fair $1 bets until  
 * he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the
 * number of   times he/she wins and the number of bets he/she makes. Run the
 * experiment N   times, averages the results, and prints them out.
 * 
 * @author amresh kumar
 *
 */
public class Gambler {
	/**
	 * to gambletill the gambler is put of stack or reaches his goal
	 * 
	 * @param stake int
	 * @param goal  int
	 */
	public void gamble(int stake, int goal) {
		int win = 0;
		int loss = 0;
		double totalChance = 0;
		Random random = new Random();
		while (!(stake == 0 || stake == goal)) {
			int gamble = random.nextInt(3);
			totalChance++;
			if (gamble == 1) {
				stake--;
				loss++;
				System.out.println("loss, \t" + stake + " stake left");
			} else {
				stake++;
				win++;
				System.out.println("win, \t" + stake + " stake left");
			}

		}
		System.out.println("win % : \t" + (win / totalChance) * 100);
		System.out.println("loss % : \t" + (loss / totalChance) * 100);
	}

	/**
	 * to start the gamble by taking the gamblers stake and goal
	 */
	public void startGamble() {
		System.out.println("Let's gamble");
		System.out.println("Enter your stake");
		int stake = InputUtility.nextInteger();
		System.out.println("Enter your goal (goal must be greater then your stake)");
		int goal = InputUtility.nextInteger();

		if (stake > 1 && goal > stake)
			gamble(stake, goal);
		else
			System.out.println("You entered somethig wrong");

	}

	public static void main(String[] args) {
		Gambler player = new Gambler();
		player.startGamble();
	}
}
