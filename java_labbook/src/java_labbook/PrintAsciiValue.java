package java_labbook;

public class PrintAsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char ch = 'k';
		
		int ascii = ch;
		//you can also cast char to int
		
		int castAscii = (int) ch;
		
		System.out.println("The ASCII value of "+ ch + " is: "+ ascii);
		System.out.println("The ASCII value of "+ ch + " is: "+ castAscii);
		

	}

}
