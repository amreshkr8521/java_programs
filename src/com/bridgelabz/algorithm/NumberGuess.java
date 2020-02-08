package com.blab.amresh;

/**
 * guess the number by asking the grater than and less then from the number
 * 
 * @author amresh kumar
 *
 */
public class NumberGuess {

	static int range = 0;

	/**
	 * guess the number by using binary search
	 * 
	 * @param first int
	 * @param last  int
	 */
	public void binarySearch(int first, int last) {
		if (first == last) {
			System.out.println("Your Number is : " + first);
			return;
		}
		int middle = (first + last) / 2;
		System.out.println("Is the number between " + first + " and " + middle + " ?");
		if (InputUtility.next().equals("y"))
			binarySearch(first, middle);

		else
			binarySearch(middle, last);
	}

	public static void main(String[] args) {
		NumberGuess object = new NumberGuess();
		System.out.println("Enter your range");
		range = (int) Math.pow(2, InputUtility.nextInteger());
		object.binarySearch(0, range);
	}
}
