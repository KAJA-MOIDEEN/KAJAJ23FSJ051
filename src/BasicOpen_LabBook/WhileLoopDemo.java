package BasicOpen_LabBook;

import java.util.Scanner;

public class WhileLoopDemo {
public static void main(String[] args) {
	int number,sum=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("n Please Enter any Integer Value Below 10:");
	number = sc.nextInt();
	
	while (number<=10) {
		sum = sum + number;
		number++;
		//sum = 0 + 8;
		//sum = 8 + 9;
		//sum = 17 + 10;
		//sum = 27 , while loop break number<=10
		
	}
	System.out.format(" Sum of the Numbers from the While Loop is: %d",sum);
	
}
}
