package java_labbook;

import java.util.Scanner;

public class Multiply {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scan = new Scanner(System.in);	
		
		System.out.println("Enter the first value for i...");
		
		int i = scan.nextInt();
		
		System.out.println("Enter the Scound value for j...");
		
		int j = scan.nextInt();
		
		int mul= i * j;
		
		System.out.println("The multiplacation of "+ i + " and " + j +" = " +mul);
		
	

	}

}
