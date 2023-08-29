package AreaFormulas;

import java.util.Scanner;

public class AreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter side of Square: ");
		double side = scanner.nextDouble();
		// Area = side*side;
		double area = side*side;
		System.out.println("the area of rectangle is : "+area );

	}

}
