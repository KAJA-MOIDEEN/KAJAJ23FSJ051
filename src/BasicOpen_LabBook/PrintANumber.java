package BasicOpen_LabBook;

import java.util.Scanner;
/* in this program, you will lean to print a number entered by user in java.
 * the integer is stored in a variable using system.in,
 * and is displayed on the screen using System.out.*/

public class PrintANumber {

	public static void main(String[] args) {
	/*create a reader instance witch takes 
	 * input from standard input - keyboard */
		Scanner reader = new Scanner(System.in);
		System.out.println(" Enter the Number ");
		// nextInt() reads the next integer from the keyboard
		int number = reader.nextInt();
		// println() prints the following line to output screen
		System.out.println("You Entered: "+ number);
	}

}
