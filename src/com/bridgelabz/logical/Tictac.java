
/** 
 * TicTac is a game which is a matrix of 3*3 and played with the computer
 * one player has "X" and other has "O"
 * the player who makes first three marks in a straight wins
 * 
 * @Author amresh kumar
 * @version 1.0
 * @since 13-11-2019
 */
package com.bridgelabz.logical;

import java.lang.Math;

import com.brdgelabz.utility.InputUtility;

public class Tictac {
	static String[] arr = { "_", "_", "_", "_", "_", "_", "_", "_", "_" };
	static int pass = 1;

	/**
	 * This method is to mark "X" or "O" for human turn
	 * 
	 * @param position at which the mark is to be made
	 * @since 13-11-2019
	 * @return null
	 */
	public static void HumanMove(int position) {
		if (position > 9 && position < 1) {
			HumanMove((int) Math.random() * 10);
		}
		if ((arr[position] == "O" || arr[position] == "X") || position > 8 || position < 1) // to check if the given position is
																				// valid or not
		{
			System.out.println("invalid place");
			System.out.println("Enter valid position ");
			int newPosition = InputUtility.nextInteger(); // valid position taken by user
			HumanMove(newPosition); // Human makes his/her move.

		} else
			arr[position - 1] = "X";
		show();
		System.out.println("****************");
		System.out.println("");
		pass = -pass;
	}

	/**
	 * This method is to mark "X" or "O" for computer turn
	 * 
	 * @param place at which the mark is to be made
	 * @since 13-11-2019
	 * @return null
	 */
	public static void ComputerMove(int position) {

		if (position > 8) {
			ComputerMove((int) Math.random() * 10);
		} else if (arr[position] == "O" || arr[position] == "X" || position < 1) {

			ComputerMove((int) Math.random() * 10); // recursive method used

		} else {
			arr[position - 1] = "O";

			show();
			System.out.println("****************");
			System.out.println("");
			pass = -pass;
		}

	}

	/**
	 * to check every row to check if anyone is winner or not
	 * 
	 * @param row String
	 * 
	 */
	public static void rowWin(String[] row) {
		if ((row[0] == "O" && row[1] == "O" & row[2] == "O") || (row[3] == "O" && row[4] == "O" & row[5] == "O")
				|| (row[6] == "O" && row[7] == "O" & row[8] == "O")) {
			System.out.println("wins");
		}

	}

	/**
	 * to check every column to check if anyone is winner or not
	 * 
	 * @param row String
	 * 
	 */
	public static void coulmnWin(String[] coulmn) {
		if ((coulmn[0] == "O" && coulmn[3] == "O" & coulmn[6] == "O")
				|| (coulmn[1] == "O" && coulmn[4] == "O" & coulmn[7] == "O")
				|| (coulmn[3] == "O" && coulmn[5] == "O" & coulmn[8] == "O")) {
			System.out.println("wins");
		}

	}

	/**
	 * to check diagonal if anyone is winner or not
	 * 
	 * @param row String
	 * 
	 */
	public static void diagonalWin(String[] a) {
		if ((a[0] == "O" && a[4] == "O" & a[8] == "O") || (a[2] == "O" && a[4] == "O" & a[6] == "O")) {
			System.out.println("Wins");
		}

	}

	/**
	 * To show the the tic-tac pattern after every pass
	 */
	static void show() {
		System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
		System.out.println(arr[3] + " " + arr[4] + " " + arr[5]);
		System.out.println(arr[6] + " " + arr[7] + " " + arr[8]);
	}

	/**
	 * the starting of the tic-tac game played between the user and computer
	 * 
	 * @param pass int
	 */
	public static void ticTac(int pass) {
		for (int count = 0; count < 9; count++) {
			if (pass == 1) {

				ComputerMove((int) (Math.random() * 10));
			} else {

				System.out.println("Enter the place to fill");
				int position = InputUtility.nextInteger();
				HumanMove(position); // calling HumanMove() to make the human take its call
			}
		}
	}

//main
	public static void main(String[] args) {
		System.out.println("enter 1: computer to start \n 2: player to start");
		ticTac(pass); // calling ticTac() to play Tic tac
	}
}
