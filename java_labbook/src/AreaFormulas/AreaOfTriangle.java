package AreaFormulas;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the with of the tran griangle");
		double base = scanner.nextDouble();
		System.out.println("Enter the height of the tirangle");
		double height = scanner.nextDouble();
		
		//Area of the Tirangle formulas
		double area = (base*height)/2;
		System.out.println("Area of tirangle is... "+area);
		
	}

}
