package BasicOpen_LabBook;

public class SumOfArrayValue {

	public static void main(String[] args) {
		// program to sum the element of an array
		int[] array = { 10, 20, 30, 40, 50, 10 };
		int sum = 0;
		// Advanced for loop
		for (int num : array) {
			sum += num;

		}
		System.out.println("Sum of Array Element is : " + sum);

	}

}
