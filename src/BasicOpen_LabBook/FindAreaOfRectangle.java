package BasicOpen_LabBook;

import java.util.Scanner;

public class FindAreaOfRectangle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the leangh of Rectangle:");
		double leangh = scanner.nextDouble();
		System.out.println("Enter the widh of Rectangle:");
		double width = scanner.nextDouble();
		//Area = leangh * witdh
		double area = leangh * width;
		System.out.println("Area of Rectangle is:"+area);
	}
}
