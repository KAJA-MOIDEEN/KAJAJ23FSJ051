package java_labbook;

import java.util.Scanner;

public class Vowel {
 // Vowels identifing
	public static void main(String[] args) {
		
		
		System.out.println("Enter the char value ");
		
		// input from user 
		Scanner scan = new Scanner(System.in);
		
		// char value must be get like this scan.next().charAt(0);
		
		char ch = scan.next().charAt(0);
		
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u')
			
			System.out.println(ch + "  is vowel");
		else
			System.out.println(ch + " is consonat");

	}
}
