package Basic_ClosedLabBook;

import java.lang.reflect.Array;
import java.util.Arrays;

// 9. Write a program to reverse elements in the Array
public class ReverseElementArray {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("Before reverse " + Arrays.toString(arr));
		reversArray(arr);

		System.out.println("After Reverse" + Arrays.toString(arr));
	}

	static void reversArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
