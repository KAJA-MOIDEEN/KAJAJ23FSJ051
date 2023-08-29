package PyramidExample;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		int rows ,number = 1, counter, j;
		//to get the user's input
		Scanner input = new Scanner(System.in);
				System.out.println("Enter The Number of Rows for Floyd's Triangle:");
		//Copying user input into an integer variable named rows 
		rows = input.nextInt();
		System.out.println("Floyd's triangle");
		System.out.println("****************");
		for(counter =1 ; counter<=rows; counter++)
		{
			for(j=1; j<=counter; j++)
			{
				System.out.print(number+" ");
				//incrementing the number value
				number++;
				
			}
			System.out.println();
		}
		
		
		// TODO Auto-generated method stub

	}

}
