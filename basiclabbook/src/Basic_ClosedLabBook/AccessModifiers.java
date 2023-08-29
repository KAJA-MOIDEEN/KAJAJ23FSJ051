package Basic_ClosedLabBook;

public class AccessModifiers {

	public static void main(String[] args) {
        AccessModifiersExample obj = new AccessModifiersExample();
        
        // Accessing public members
        System.out.println("Public variable: " + obj.publicVar);
        obj.publicMethod();
        
        //Attempting to access private members (will result in a compilation error)
       // System.out.println("Private variable: " + obj.privateVar);
        // obj.privateMethod();
        
        // Accessing protected members (from the same package)
        System.out.println("Protected variable: " + obj.protectedVar);
        obj.protectedMethod();
        
        // Accessing default (package-private) members (from the same package)
        System.out.println("Default variable: " + obj.defaultVar);
        obj.defaultMethod();
    }
}
class  AccessModifiersExample{
	public int publicVar = 10;
	private int privateVar = 20;
	protected int protectedVar = 30;
	int defaultVar = 40; 
			public void publicMethod() {
				System.out.println("This is a public method");
			}
			private void privateMethod() {
				System.out.println("This is a private method");
			}
			protected void protectedMethod() {
				System.out.println("This is a protacted method");
			}
			 void defaultMethod() {
				System.out.println("This is a default method");
			}
	
}