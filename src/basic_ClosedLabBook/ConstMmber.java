package basic_ClosedLabBook;

/**
 * 17. Write a java program to test: a) to modify const member b) to access
 * static member in a non -static method c) create a class with one argument
 * constructor and try to instantiate object without parameter
 */
class TestClass {
	// Part a: Modify const member
	TestClass() {
		final int constMember = 10;
	}

	// Part b: Access static member in a non-static method
	static int staticMember = 20;

	void nonStaticMethod() {
		System.out.println("Accessing static member in a non-static method: " + staticMember);
	}

	// Part c: Class with one-argument constructor
	// ones creating one-parameter constructor we must create no parameter
	// constructor
	// TestClass(){
	// System.out.println("");
	// }
	int value;

	TestClass(int val) {
		value = val;
	}
}

public class ConstMmber {
	public static void main(String[] args) {
		// Part a: Modifying const member
		TestClass objA = new TestClass();
		// objA.constMember = 15; // This line will cause an error since constMember is
		// final

		// Part b: Accessing static member in a non-static method
		TestClass objB = new TestClass();
		objB.nonStaticMethod();

		// Part c: Instantiate object without parameter
		// TestClass objC = new TestClass(); // This line will cause an error since
		// there's no parameterless constructor
		TestClass objC = new TestClass(30); // Instantiate object using the one-argument constructor
		System.out.println("Value of objC: " + objC.value);
	}
}