package java_labbook;

import java.util.Scanner;

public class OddOrEnen {

	public static void main(String[] args) {
		
		int num;
		
		System.out.println("Enter the integer number: ");
		
		//the input provided by the user is stored in num
		
		Scanner input = new Scanner(System.in);
		
		
		num = input.nextInt();
		
		/* if number is divisible by 2 then it's an even number
		 * else odd number
		 *
		 */
		if (num % 2==0)
			System.out.println("Entered the value is even ");
			else 
				System.out.println("Enterd the value is Odd");
		}
		
		// TODO Auto-generated method stub

	}

