package com.brdgelabz.utility;



/**
 * To contain all the method of Functional program used in functional prgramming
 * 
 * @author amresh kumar
 * @since 19-11-2019
 * @version 1.0
 *
 */
public class FunctionalUtility {
	

	/**
	 * TO determine the effective temperature of an area at a given temperature and
	 * velocity
	 * 
	 * @param t --> integer
	 * @param v --> integer
	 * @return null
	 * 
	 */

	public static double windChill(int t, int v) {

		if (t < 50 || v < 120 || v > 3)// applying condition to get effective temperature

			// calculation for determining the effective temperature
			return (34.74 + 0.621 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16));
		else
			return 0;

	}

	/**
	 * To take the row and colunm from the user and make the 2-D array and then take
	 * input for that 2-D array
	 * 
	 */
	public static void twoDimensionalArray() {

		System.out.println("Enter the row");
		int row = InputUtility.nextInteger();// number of row taken by the user
		System.out.println("Enter the coulmn");
		int column = InputUtility.nextInteger();// number of column is taken by user
		int matrix[][] = new int[row][column];
		System.out.println("Enter the 2D array elements");
		for (int row_traverse = 0; row_traverse < row; row_traverse++)// Row is used to traverse through row
		{
			for (int column_traverse = 0; column_traverse < column; column_traverse++)// column is used to traverse
																						// through column
			{
				matrix[row_traverse][column_traverse] = InputUtility.nextInteger();
			}
		}

		System.out.println("Entered 2D array is ");
		for (int row_traverse = 0; row_traverse < row; row_traverse++)// Row is used to traverse through row
		{
			for (int column_traverse = 0; column_traverse < column; column_traverse++) // column is used to traverse
																						// through column
			{
				System.out.print(matrix[row_traverse][column_traverse] + " ");// print each value of 2D array
			}
		}

	}

	/**
	 * To calculate roots of the expression aX*X + b*X +c
	 * 
	 * @param a double
	 * @param b double
	 * @param c double
	 * @since 19-11-2019
	 */
	public static void roots(double a, double b, double c) {
		double delta = Math.abs(b * b - 4 * a * c); // calculating the delta
		double root1 = (-b + Math.sqrt(delta)) / (2 * a); // calculating the root1
		double root2 = (-b - Math.sqrt(delta)) / (2 * a); // calculating the root2
		System.out.println("root1 =" + root1); // root1
		System.out.println("root2 =" + root2); // root2
	}

	/**
	 * To find the distance between (x,y) coordinate and (0,0) coordinate
	 * 
	 * @param x_coordinate int
	 * @param y_coordinate int
	 * @since 19-11-2019
	 */
	public static void distance(int x_coordinate, int y_coordinate) {
		// calculating the distance
		double distance = Math.sqrt(x_coordinate * x_coordinate + y_coordinate * y_coordinate);
		System.out.println("Distance =" + distance); // displaying the result
	}

	/**
	 * To find three number in a array to determine that the sum of all three number
	 * should be Zero
	 * 
	 * @param array int
	 * @since 19-11-2019
	 */
	public static void addsZero(int[] array) {
		// i ,j, k are three integer used for the iteration of the number of the array
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {

				for (int k = j + 1; k < array.length; k++) {
					if (array[i] + array[j] + array[k] == 0) // to check if sum is Zero or not
					{

						System.out.println(array[i] + "+" + array[j] + "+" + array[k] + "=0"); // display if sum is Zero
					}
				}
			}
		}
	}
}
