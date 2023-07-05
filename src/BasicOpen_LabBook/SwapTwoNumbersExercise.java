package BasicOpen_LabBook;

public class SwapTwoNumbersExercise {

	public static void main(String[] args) {
		//assigned value of first and second
		float first = 2.50f , second = 4.50f;
		// print the value before swapping
		System.out.println("--Before swap--");
		System.out.println("First Number = "+first);
		System.out.println("Second Number = "+second);
		
		//Value of first assigned to temporary
		float temproary = first;
		
		//value of second assigned to first
		first = second;
		
		//value of temporary (witch contains the initial value of first )is assigned to second
		second = temproary;
		
		//now print the value after swapping
		System.out.println("--After swap--");
		System.out.println("first number"+first);
		System.out.println("Second number"+second);
			}

}
