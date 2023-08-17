package basic_ClosedLabBook;

import java.util.Scanner;

public class AverageOFNNumbers {
	/*
	 * Write a program to calculate average of the n number using a separate
	 * function other than main.
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the total count of numbers: ");
		int n = scanner.nextInt();

		// Create an array to store 'n' numbers
		int[] numbers = new int[n];

		// Read 'n' numbers from the user and store them in the array
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter number " + (i + 1) + ": ");
			numbers[i] = scanner.nextInt();
		}

		// Call the calculateAverage function and store the result in 'average'
		double average = calculateAverage(numbers);

		// Display the result
		System.out.println("The average of " + n + " numbers is: " + average);

		// Close the scanner
		scanner.close();
	}

	// Function to calculate the average of an array of integers
	public static double calculateAverage(int[] arr) {
		int sum = 0;
		for (int num : arr) {
			sum += num;
		}
		return (double) sum / arr.length;
	}

}
