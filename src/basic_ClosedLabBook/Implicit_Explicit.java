package basic_ClosedLabBook;

/*3.Write a program to declare all primitive data types with all possible types of
initialization and also check implicit and explicit type casting by assigning
them to each other.
*/
public class Implicit_Explicit {

	public static void main(String[] args) {
		byte b = 10;
		short s = 20;
		int i = 234;
		long l = 256;
		float f = 724.3f;
		double d = 62354.23423d;
		boolean bool = true;
		
		System.out.println("primitive type");
		System.out.println();
		
		System.out.println("byte = " +b);
		System.out.println("short = " +s);
		System.out.println("int = " +i);
		System.out.println("long = " +l);
		System.out.println("float = " +f);
		System.out.println("double = " +d);
		System.out.println("boolean = " +bool);
		System.out.println();
		
		System.out.println("implicit type casting or automatic type casting");
		// implicit type casting or automatic type casting
		short S = b; // byte to short
		System.out.println("byte to short "+S);
		int I = s; // short to int
		System.out.println("short to int "+I);
		long L = i; // int to long
		System.out.println("int to long " +L);
		double D = f; // float to double
		System.out.println("float to double "+D);
		D = l; // long to double
		System.out.println("long to double "+D);
		System.out.println();
		System.out.println("Explicit type casting ");
		System.out.println();
		
		
		b = (byte)s; // short to byte
		System.out.println("short to byte "+b);
		i = (int)l; // long to int
		System.out.println("long to int " +i);
		f = (float)l;//long to float
		System.out.println("long to float "+f);
		i = (int)d; //double to int
		System.out.println("double to int "+ i);
		
		
		
		

	}

}
