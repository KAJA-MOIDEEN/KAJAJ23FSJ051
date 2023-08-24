package Basic_ClosedLabBook;

/*11.Write a program to display number matrix as follows using Two Dimensional
Rectangular Array.
1
2 3
4 5 6
7 8 9 10*/
public class DisplayMatrixProgramTwo {
	public static void main(String[] args) {
		int row = 4, col = 4, num = 1;
		int[][] arr2D = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j <= i; j++) {
				arr2D[i][j] = num;
				num++;
				System.out.print(arr2D[i][j]);
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
}
