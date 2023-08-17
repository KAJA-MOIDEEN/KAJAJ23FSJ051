package BasicOpen_LabBook;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		int num;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer number");
		// the input from user is stored in num
		num = input.nextInt();
		/*
		 * if number is divisible by 2 then it's an even number else odd number
		 */
		if (num % 2 == 0) {
			System.out.println("Entered number is even");
		} else {
			System.out.println("Entered number is odd");

		}

	}

}
