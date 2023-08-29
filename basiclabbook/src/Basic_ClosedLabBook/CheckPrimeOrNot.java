package Basic_ClosedLabBook;

import java.util.Scanner;

//4.Write a program to find weather a number is Prime or not
public class CheckPrimeOrNot {

	public static void main(String[] args) {
		boolean isPrime = true;
		int temp;
		System.out.println("Enter a number ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}

		// if isprime is true then the number is prime else not
		if (isPrime) {
			System.out.println("given number is prime numbre :");
		} else {
			System.out.println("given number is not prime :");
		}
	}

}
