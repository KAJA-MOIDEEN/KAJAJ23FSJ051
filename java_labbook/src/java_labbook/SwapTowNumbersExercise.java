package java_labbook;

public class SwapTowNumbersExercise {

	public static void main(String[] args) {
		// Swap the two numbers 
		
		/* like this
		 * a=b;
		 * b=c;
		 * c=a;
		 */
		float first = 2.50f , second = 4.50f;
		System.out.println("... Before swapping...");
		System.out.println("First number= "+ first);
		System.out.println("Second number= "+ second);
		// value of first is assigned to temporary
		float temporary = first;
		// value of second is assigned to first
		first = second;
		// value of temporory (which contains the initial value of first) is assigned to second
		second = temporary;
		System.out.println(" ");
		System.out.println("... After swapping...");
		System.out.println("First number= "+ first);
		System.out.println("Second number= "+ second);
	}

}
