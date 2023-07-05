package BasicOpen_LabBook;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n1,n2,n3;
		System.out.println("Enter first double number");	
		n1= scan.nextDouble();
		System.out.println("Entr second double number");
		n2= scan.nextDouble();
		System.out.println("Entr three double number");
		n3= scan.nextDouble();
		
		if(n1>=n2 && n1>=n3)
			System.out.println(n1+"is the largest number. ");
		else if(n2>=n1 && n2>=n3)
			System.out.println(n2+"is the largest number. ");
		else
			System.out.println(n3 +" is the largest number. ");
		
	

	}

}
