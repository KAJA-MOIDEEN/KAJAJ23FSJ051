package BasicOpen_LabBook;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		//find the area of triangle
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the height :");
		double height = scan.nextDouble();
		
		System.out.println("Enter the width :");
		double base = scan.nextDouble();
		
		// Area of tirangle = (height * width)/2
		double area = (base*height)/2;
		
		System.out.println("Area of tirangle is : "+area);
		
		
		
		

	}

}
