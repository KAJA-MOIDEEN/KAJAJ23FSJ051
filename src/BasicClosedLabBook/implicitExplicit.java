package BasicClosedLabBook;

public class implicitExplicit {

	public static void main(String[] args) {
		// primitive type
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40L;
		float f = 50.0f;
		double d = 60.1d;
		char c = 'A';
		boolean bool = true;
		
		// implicit type casting
		int implicitInt = b; // byte to int
		long implicitLong = i; // int to long
		float implicitFloat = l; // long to float
		double implicitDloat = d; // float to double 
		
		// explicit type casting
		byte explicitByte = (byte)i; // int to byte
		int explicitInt = (int)l; // long to int
		float explicitFloat = (float)s; // int to float
		long explicitLong = (long)d; //double to long
		
		// output
		System.out.println("Primite Types :");
		System.out.println("byte "+ b);
		System.out.println("short "+ s);
		System.out.println("int "+ i);
		System.out.println("long "+ l);
		System.out.println("float "+ f);
		System.out.println("double "+ d);
		System.out.println("char "+ c);
		System.out.println("boolean "+ bool);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		System.out.println("Implicit type casting");
		System.out.println("byte to int"+ implicitInt);
		System.out.println("int to long"+ implicitLong);
		System.out.println("long to float"+ implicitFloat);
		System.out.println("float to double" + implicitDloat);
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		System.out.println("Explicit type casting");
		System.out.println("int to byte"+ explicitByte);
		System.out.println("long to int"+ explicitInt );
		System.out.println("int to short"+ implicitFloat);
		System.out.println("double to long" + explicitLong);
	}

}
