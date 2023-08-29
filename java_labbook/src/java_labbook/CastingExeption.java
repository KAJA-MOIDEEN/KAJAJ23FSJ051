package java_labbook;

public class CastingExeption {

	//don't run the program - just type and understanding how casting works
	
	public static void main(String[] args) {
		
	byte b=10;
	
	int i = b;// will accept  - automatically type promotion 
	
	// int la byte value store avum becouse int ,  byte ah vida athigam 
	
	byte c = i; // will not accept - because lower type cannot be put in higher
                   //  	byte la int value store avathu becouse byte ah vida int value athigam 
 
	byte d=(byte)i; // type casting makes it possible to store compatible types
	
	byte x=10;
	byte y=20;
	
	byte sum=x*y; // errors is thrown because when two bytes are used in a arthmatic operation the result will be integer
	
	
	
		
		
		
		
		// TODO Auto-generated method stub

	}

}
