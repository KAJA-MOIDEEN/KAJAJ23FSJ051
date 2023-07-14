package BasicOpen_LabBook;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// user Inputting Array Elements
		Scanner scan = new Scanner(System.in);
		int[] array = new int[10];
		int sum = 0;
		System.out.println("Enter the elements :");
		for (int i = 0;i<10; i++) {
			array[i] = scan.nextInt();
		}
		for(int num : array) {
			sum = sum+num;
		}
System.out.println("Sum of array elements is :"+ sum);
	}

}
