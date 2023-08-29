package Basic_ClosedLabBook;

import java.util.Scanner;

/*16. Write a program to search a given element is present or not? If 
*present, display the location and how many times it occurs 
*
*/
public class PresenOrNot {
	static void location(int[] elements, int n) {
		for (int i = 0; i < elements.length; i++) {
			if (elements[i] == n)
				System.out.println("Element location is " + i);
		}
	}

	public static int PresentOrNot(int n, int[] element) {
		int counts = 0;

		for (int i = 0; i < element.length; i++) {
			if (element[i] == n) {
				counts++;
				System.out.println("location " + i);
			}
		}
		return counts;
	}

	public static void main(String[] args) {
		System.out.println("Enter the size of an array ");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] element = new int[size];
		for (int i = 0; i < element.length; i++) {
			System.out.println("Enter the element :" + (i + 1));
			element[i] = scan.nextInt();

		}

		System.out.println("enter the number to target");

		int target = scan.nextInt();
		int counts = PresentOrNot(target, element);
		if (counts == 0) {
			System.out.println("given element is not present");

		} else {
			System.out.println("given element is present " + counts + " time(s)");
		}
		scan.close();

	}

}
