/**
 * 
 */
package basic_ClosedLabBook;

/**
 * 
 */
public class CommendLineArguments {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("NO COMMAND LINE ARGUMENTS POVIDED.");
		} else {
			System.out.println("COMMAND LINE ARGUMENTS ");
		}
		for (int i = 0; i < args.length; i++) {
			System.out.println("Argument" + (i + 1) + ":" + args[i]);
		}

	}

}
