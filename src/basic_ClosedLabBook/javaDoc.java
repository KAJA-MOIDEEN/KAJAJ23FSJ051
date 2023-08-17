package basic_ClosedLabBook;

/**
 * This program calculates and displays the result of students based on their marks.
 * It takes the number of students and subjects, as well as the marks for each student,
 * and then calculates the total marks, average marks, and grade for each student.
 */
import java.util.Scanner;

public class javaDoc {
	/**
	 * This is the main method that executes when the program is run. It takes user
	 * input for the number of students, the number of subjects, and the marks for
	 * each student, and then calls the calculateResults method.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of students: ");
		int numStudents = scanner.nextInt();

		System.out.print("Enter the number of subjects: ");
		int numSubjects = scanner.nextInt();

		double[][] marks = new double[numStudents][numSubjects];

		for (int i = 0; i < numStudents; i++) {
			System.out.println("Enter marks for student " + (i + 1) + ":");
			for (int j = 0; j < numSubjects; j++) {
				System.out.print("Subject " + (j + 1) + ": ");
				marks[i][j] = scanner.nextDouble();
			}
		}

		scanner.close();

		calculateResults(marks);
	}

	/**
	 * This method calculates and displays the results for each student. It takes a
	 * 2D array of marks as input and calculates the total marks, average marks, and
	 * grade for each student, displaying the results.
	 */
	public static void calculateResults(double[][] marks) {
		char[] grades = { 'A', 'B', 'C', 'D', 'F' };

		for (int i = 0; i < marks.length; i++) {
			double totalMarks = 0;
			for (int j = 0; j < marks[i].length; j++) {
				totalMarks += marks[i][j];
			}

			double averageMarks = totalMarks / marks[i].length;

			char grade;
			if (averageMarks >= 90) {
				grade = grades[0];
			} else if (averageMarks >= 80) {
				grade = grades[1];
			} else if (averageMarks >= 70) {
				grade = grades[2];
			} else if (averageMarks >= 60) {
				grade = grades[3];
			} else {
				grade = grades[4];
			}

			System.out.println("Student " + (i + 1) + ": Total Marks = " + totalMarks + ", Average Marks = "
					+ String.format("%.2f", averageMarks) + ", Grade = " + grade);
		}
	}
}
