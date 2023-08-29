package BasicOpen_LabBook;

import java.util.Scanner;

public class QuotientRemainder {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);

		System.out.println("Enter the dividend: ");
		int dividend = var.nextInt();
		System.out.println("Enter the divisor:");
		int divisor = var.nextInt();

		int quotient = dividend / divisor;
		int remainder = dividend % divisor;

		System.out.println("Quotient = " + quotient);
		System.out.println("Remainder = " + remainder);

	}
}
