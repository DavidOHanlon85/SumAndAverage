/**
 * 
 */
package labExercises;

import java.util.Scanner;

/**
 * 
 */
public class Exercise07_SumAndAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userInput = userInput();
		sumAndAverage(userInput);

	}

	
	/**
	 * This method collects user integer input
	 * 
	 * @return - Return user integer input
	 */
	
	public static int userInput() {

		// Instantiate Scanner
		Scanner myScan = new Scanner(System.in);

		// Declare Variables

		int userInput = 0;

		try {
			do {
				// User Prompt
				System.out.println("Declare a number between 1 and 100");

				// User input collection
				userInput = myScan.nextInt();
				myScan.nextLine(); // clear scanner
				myScan.close();
			} while (userInput < 1 || userInput > 100);
		} catch (Exception ex) {
			System.out.println("Invalid input");
		}
		return userInput;

	}

	/**
	 * This method will print the sum of consecutive integers up to the upper bound
	 * and find the average of these numbers
	 * 
	 * @param userInput - Upper bound for integers
	 */
	public static void sumAndAverage(int userInput) {

		int total = 0;
		double average = 0;

		for (int i = 0; i <= userInput; i++) {
			total += i;
		}

		average = (double) total / userInput;

		System.out.println("The sum is " + total);
		System.out.println("The average is " + average);
	}
}
