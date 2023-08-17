package basic_ClosedLabBook;

/* 15.Write a program : 
 a) To generate a Prime number list between 1 to 100 
 b) To check given number is an Armstrong number or perfect number 
or palindrome or none of these */
import java.util.ArrayList;
import java.util.List;

public class PrimeArmstrongPalindrome {
	
	
	    // Function to generate a Prime number list between 1 to 100
	    public static List<Integer> generatePrimeNumbers(int start, int end) {
	        List<Integer> primes = new ArrayList<>();
	        
	        for (int num = start; num <= end; num++) {
	            boolean isPrime = true;
	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime && num > 1) {
	                primes.add(num);
	            }
	        }
	        
	        return primes;
	    }
	    
	    // Function to check if a number is an Armstrong number
	    public static boolean isArmstrong(int num) {
	        int originalNum = num;
	        int sum = 0;
	        
	        while (num > 0) {
	            int digit = num % 10;
	            sum += Math.pow(digit, 3);
	            num /= 10;
	        }
	        
	        return sum == originalNum;
	    }
	    
	    // Function to check if a number is a Perfect number
	    public static boolean isPerfect(int num) {
	        int sum = 0;
	        for (int i = 1; i <= num / 2; i++) {
	            if (num % i == 0) {
	                sum += i;
	            }
	        }
	        return sum == num;
	    }
	    
	    // Function to check if a number is a Palindrome
	    public static boolean isPalindrome(int num) {
	        int originalNum = num;
	        int reversedNum = 0;
	        
	        while (num > 0) {
	            int digit = num % 10;
	            reversedNum = reversedNum * 10 + digit;
	            num /= 10;
	        }
	        
	        return reversedNum == originalNum;
	    }
	    
	    public static void main(String[] args) {
	        System.out.println("Prime numbers between 1 and 100:");
	        List<Integer> primes = generatePrimeNumbers(1, 100);
	        System.out.println(primes);

	        int number = 153; // Example number for Armstrong, Perfect, and Palindrome checks
	        
	        if (isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else if (isPerfect(number)) {
	            System.out.println(number + " is a Perfect number.");
	        } else if (isPalindrome(number)) {
	            System.out.println(number + " is a Palindrome number.");
	        } else {
	            System.out.println(number + " is none of these.");
	        }
	    }
	}

	
		

	

}
