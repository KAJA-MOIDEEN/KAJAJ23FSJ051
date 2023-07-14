package BasicOpen_LabBook;

import java.util.Scanner;

public class FindAreaOfSquare {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter side of the square:");
		// store the captured value in the variable
		double side = scanner.nextDouble();
		//area of Square
		double area = side * side;
		System.out.println("Area of Square is "+ area);
		
	}

}
