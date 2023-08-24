package Basic_ClosedLabBook;

import java.util.Arrays;
import java.util.Scanner;

/*10.Write a program to display number matrix as follows using Two Dimensional
Rectangular Array.
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
*/
public class DisplayMatrixProgramOne {
	public static void main(String[] args) {
		int[][] arr2D = new int[4][4];
		int num = 1;
		int row = 4, col = 4;
		// fill the matrix with number
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr2D[i][j] = num;
				num++;
			}
		}
		// display number matrix
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr2D[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
