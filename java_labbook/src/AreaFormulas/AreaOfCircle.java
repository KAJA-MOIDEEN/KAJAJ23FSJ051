package AreaFormulas;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the radius");
	double radius = scanner.nextDouble();
	
	//Area =pi*radius*radius
	double area = Math.PI * (radius*radius);
	System.out.println("The area of cricle is:"+area);
	//circumference = 2*PI*radius
	double circumference = Math.PI * 2*radius;
	System.out.println("The circumference of the circle"+circumference);
	
	
	}
	

}
