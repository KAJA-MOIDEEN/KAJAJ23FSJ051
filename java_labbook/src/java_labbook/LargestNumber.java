package java_labbook;

import java.util.Scanner;

public class LargestNumber {
    // to find the largestNumber
	public static void main(String[] args) {
		//double n1=5.4, n2=6.3, n3=0.6;
		Scanner scan = new Scanner(System.in);
	System.out.println("Enert the three numbers in double...");
	
	double n1 = scan.nextDouble();
			double n2 = scan.nextDouble();
					double n3 = scan.nextDouble();
			
		if(n1 >= n2 && n1 >= n3 )
			System.out.println(n1 + " is the lagerst number.");
		else if(n2 >= n1 && n2 >= n3)
			System.out.println(n2 + " is the lagerst number.");
		else
			System.out.println(n3 + " is the lagerst number.");
		
		
		// TODO Auto-generated method stub

	}

}
