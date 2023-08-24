package BasicOpen_LabBook;

import java.util.Scanner;

public class MultiplayTwoNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter value for num1");

		int num1 = scan.nextInt();
		System.out.println("Enter the for num2");

		int num2 = scan.nextInt();
		int mul = num1 * num2;
		System.out.println("the multiplication of num1" + num1 + "and num2 " + num2 + " = " + mul);
	}

}
