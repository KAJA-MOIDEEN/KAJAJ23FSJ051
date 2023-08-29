package java_labbook;

import java.util.Scanner;

public class printANumber {

	public static void main(String[] args) {
		
		
		//creates a reader instance which takes 
		// input from standard input - ketboard
		Scanner reader = new Scanner(System.in);
				System.out.println("Enter a number:");
		//nextint() reads the next integer from the keyboard
		
		int number = reader.nextInt();
		
		// println() prints the follwing line to the outpuit screen
		System.out.println("you entered= " + number);
	}

}
