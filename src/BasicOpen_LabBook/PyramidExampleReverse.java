package BasicOpen_LabBook;

public class PyramidExampleReverse {
	public static void main(String[] args) {
		int temp = 6;
		for (int i = 1; i <= temp; i++) {
			for (int j = temp; j >= i; j--) {
				System.out.print("* ");
			}
			System.out.println();// new line
		}
	}

}
