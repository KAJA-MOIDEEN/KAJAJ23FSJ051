package BasicOpen_LabBook;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character:");
		/*
		 * input here string word = "kaja"; in this word = "kaja" having length = 4 and
		 * 4 element index start from 0 so charAt(0) means first element of the string
		 */
		ch = scan.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
			System.out.println(" is Vowel");
		else
			System.out.println(" Is Consoant");

	}

}
