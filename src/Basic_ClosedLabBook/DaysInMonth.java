package Basic_ClosedLabBook;
import java.util.Scanner;
/*21. Write a program using Switch–case to print number of days in 
a month. For the month of February check for leap year and 
calculate.*/
public class DaysInMonth {
	
	public static void main(String[] args) {
	int month = 2; //Example February
	System.out.println("Eter The Year Ex: 2000 ");
	Scanner scan = new Scanner(System.in);
	int year = scan.nextInt(); 
	scan.close();
	int days;
	switch(month) {
	case 1:// January
	case 3:// march
	case 5:// May
	case 7:// July
	case 8:// August
	case 10:// October
	case 12:// December
		days = 31;
		break;
	case 4:// April
	case 6:// June
	case 9:// September
	case 11://November
		days = 30;
		break;
	case 2:// February
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
			days = 29;
		}else {
			days = 28;	
			}
		break;
	default:
		System.out.println("Invalide month");
		return;
	}	
	System.out.println("Number of days in month " + month + " of year " + year + ": " + days);
	}
	
	}

