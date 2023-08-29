package BasicOpen_LabBook;

public class CastingExercise {

	public static void main(String[] args) {
		byte b = 10;

		int i = b; // will accept - automatic type promotion

		byte c = i; // will not accept - lower type can not put in higher

		byte d = (byte) i; // type casting make it possible to store compatible type.

		byte x = 10;
		byte y = 20;

		byte sum = x * y; // Error is thrown because when two byte are used in an arithmetic operation,
							// the result will be integer

		byte sum1 = (byte) (x * y); // type casting make it possible to store and use an arithmetic operation the
									// result will be byte

	}

}
