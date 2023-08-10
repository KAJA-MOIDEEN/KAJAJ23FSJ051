package basic_ClosedLabBook;

import java.util.Scanner;
/*Write a Program to calculate result of students.(take no of student as
 * rows and marks as columns of two Dimensional Array)
 * */
class StudentResultCalculator{
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number of Student : ");
	int noStudent = scan.nextInt();
	System.out.println("Enter the number of Subjuct : ");
	int noSubjuct = scan.nextInt();
	
	int[][] Marks = new int[noStudent][noSubjuct];
	 
	for(int i = 0;i<noStudent;i++) {
		System.out.println("Enter Marks for Student " +(i + 1)+" : ");
		for(int j =0;j<noSubjuct;j++) {
			System.out.print("Subject "+ (j + 1)+": ");
			Marks[i][j] = scan.nextInt();		
		}
	}
	scan.close();
	calculate(Marks);
	
	}
	private static void calculate(int[][] Marks) {
		
		for(int i = 0 ; i < Marks.length ; i++){ // Marks.length -- length of the row
			double totalMarks = 0;
			for(int j =0; j< Marks[i].length;j++) { //Marks[i].length --  row[0] of the column of the length
			totalMarks += Marks[i][j]; // add sum of columns
			}
		
		double avarageMarks = totalMarks / Marks[i].length;
	System.out.println("Student :"+(i+1)+" totalMarks : " + totalMarks+" Avarage : " +avarageMarks);
		}
	}
}
