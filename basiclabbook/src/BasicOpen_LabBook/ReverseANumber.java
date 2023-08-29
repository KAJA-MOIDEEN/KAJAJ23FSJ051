package BasicOpen_LabBook;

import java.util.Scanner;

//Reversing a number
public class ReverseANumber {

	public static void main(String[] args) {
		int num = 0;
		int reversenm = 0;
		System.out.println("Input your number and press enter");
		// this statement is will capture the user input
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		// While loop : logic to find out reverse number
		while (num != 0) {
			reversenm = reversenm * 10;
			reversenm = reversenm + num % 10;
			num = num / 10;
		}
		System.out.println("Reverse of input number is :" + reversenm);

	}

}
