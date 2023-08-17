package basic_ClosedLabBook;


import java.util.Arrays;
/*Write a program to find the largest element in each row of a 
two dimensional array */
public class LargestNumber2DArray {

	public static void main(String[] args) {

		int[][]array = {
				{123,567,765,788},
				{345,433,678,543},
				{342,311,453,312}
		};
		
		if(array.length == 0 || array[0].length==0) {
			System.out.println("Given Element is Empty");
		}
		else {
			System.out.println("The Given Element is : ");
		for(int[] row : array) {
			System.out.println(Arrays.toString(row));
			}	
		}
		largestNumber(array);
	}
	
	public static void largestNumber(int[][] array){
		int rowNum = 1;
		for(int[] row : array) {
			int maxInRow = row[0];
			for( int num : row) {
				if(maxInRow<num) {
					maxInRow = num;
				}
			}
			System.out.println("Largest Number In row "+ rowNum + ": " +maxInRow);
		rowNum++;	
		}
		}
	}
	