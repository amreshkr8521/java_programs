package com.brdgelabz.utility;

/**
 * It contain method required by the junit programs
 * 
 * @author amresh kumar
 *
 */
public class JunitUtility {

	/**
	 * To calculate number of notes needed to give out the consumer in the best way
	 * 
	 * @param money int
	 */
	public static void notes(int money) {
		int notes[] = { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };// notes present in the vending machine
		int noteCounter[] = new int[9]; // new array to store the number of notes
		for (int i = 0; i < 9; i++)// loop to traverse all the notes
		{
			if (money > notes[i]) {
				noteCounter[i] = money / notes[i];// counting number of notes
				money = money - noteCounter[i] * notes[i];
			}
		}
		System.out.println("currency count");
		for (int i = 0; i < 9; i++)// to print the number of notes required
		{
			System.out.println(notes[i] + " = " + noteCounter[i]);
		}
	}

	/**
	 * To determine the Day Of The Week
	 * 
	 * @param month int
	 * @param year  int
	 * @param day   int
	 * @return String
	 */
	public static String dayOfWeek(int month, int year, int day) {
		String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int m = (month - 2 + 12) % 12;
		if (m <= 2) {
			year--;
		}
		year = 5 * (year % 4) + 4 * (year % 100 + 6 * (year % 400));
		int dayOfWeek = (day + (int) (2.6 * month - 0.2) + year) % 7; // Calculate the day of week.
		return days[dayOfWeek];
	}

	/**
	 * To calculate the monthly payment
	 * 
	 * @param principal int
	 * @param rate      int
	 * @param year      int
	 * @return double
	 * @since 13-11-2019
	 */
	public static double monthlyPayment(int principal, int rate, int year) {

		// payment calculation
		return (principal * (rate / (12 * 100)) / (rate - Math.pow(1 + (rate / (12 * 100)), -12 * year)));

	}

	/**
	 * To calculate the square root of any number
	 * 
	 * @param num int
	 * @return double
	 */
	public static double squreRoot(int num) {
		double temp = num;// temporary number to store the passed value
		// it denotes a very small number that is not negative, approaching zero but
		// staying positive.
		double epsilon = 1e-15;
		if (num > 0) // checks the num to be greater than Zero
		{
			// checking the condition to check the accuracy which is desired
			while (Math.abs(temp - num / temp) > epsilon * temp) {
				temp = (temp + num / temp) / 2.0; // calculation
			}
			return temp; // returns square root of num after the calculation

		} else
			return 0; // returns Zero if num is less than Zero
	}

	/**
	 * To convert the number into the binary number
	 * 
	 * @param number int
	 * @return int
	 */
	public static int toBinary(int number) {
		int binaryNumber = 0; // to store the reverse of binary number
		if (number % 2 == 0) // to check if number is divided by 2 or not
		{
			while (number != 0) {
				// calculation for the binary number
				int temp = number % 2; // store the reminder value
				binaryNumber = binaryNumber * 10 + temp;
				number = number / 2; // divide the num with 2

			}
			// Return the binary number by calling the intReverse() method
			return ((JunitUtility.intReverse(binaryNumber)) * 10);
		} else {
			while (number != 0) {
				// calculation for the binary number
				int temp = number % 2; // store the reminder value
				binaryNumber = binaryNumber * 10 + temp;
				number = number / 2; // divide the num with 2

			}
			// Return the binary number by calling the intReverse() method
			return JunitUtility.intReverse(binaryNumber);
		}
	}

	/**
	 * To return the reverse of the give number
	 * 
	 * @param number int
	 * @return int
	 */
	public static int intReverse(int number) {
		int temporary = 0;
		while (number != 0) {
			temporary = temporary * 10 + number % 10;
			number = number / 10;
		}
		return temporary;
	}
}
