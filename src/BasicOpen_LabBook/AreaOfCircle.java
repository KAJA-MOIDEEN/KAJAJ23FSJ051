package BasicOpen_LabBook;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// Find Area Of Circle
		/*
		 * we are storing the entered value in double because user enter radius in
		 * decimal
		 */
		System.out.println("area of circle ?");
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the radius ");
		double radius = scanner.nextDouble();

		// area of circle = pi*radius*radius
		double area = Math.PI * radius * radius;
		System.out.println("Area of circle is :" + area);
		{

		}

	}

}
