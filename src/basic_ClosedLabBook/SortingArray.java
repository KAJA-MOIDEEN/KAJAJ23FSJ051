package basic_ClosedLabBook;

import java.util.Arrays;

//7. Write a program to sort an array element in ascending or descending order
public class SortingArray {
	static void sortAscending() {
		int[] a = { 2, 4, 6, 1, 8, 9, 7, 3, 0, 5 };
		System.out.println("Befor" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array Sorting in Ascending Order " + Arrays.toString(a));
	}

	static void sortDecending() {
		int[] a = { 2, 4, 6, 8, 0, 1, 3, 5, 7, 9 };
		System.out.println("Befor" + Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array Sorting in Ascending Order " + Arrays.toString(a));
		int start = 0;
		int end = a.length - 1;
		// swap the array
		while (start <= end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
		System.out.println("Array Sorting in Ascending Order " + Arrays.toString(a));
	}

	public static void main(String[] args) {
		SortingArray obj = new SortingArray();
		sortAscending();
		System.out.println("\n");
		sortDecending();
	}

}
