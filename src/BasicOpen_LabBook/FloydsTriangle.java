package BasicOpen_LabBook;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		int rows , number = 1, counter,j;
		//to get the user's input
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number of rows for floyd's traingle:");
		// copying user input into an integer variable named rows
		rows = input.nextInt();
		System.out.println("Floyd's traingle");
		System.out.println("*************");
		for (counter = 1; counter<=rows; counter++) {
			for(j=1;j<=counter;j++) {
				System.out.print(number+" ");
				//Incrementing the number value
				number++;
				}
			//for new line
		System.out.println();
		}
	}
}
