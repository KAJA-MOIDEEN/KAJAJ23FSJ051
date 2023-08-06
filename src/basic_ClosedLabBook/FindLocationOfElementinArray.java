package basic_ClosedLabBook;

import java.util.Scanner;
//FIND THE LOCATION OF THE ELEMENT IN ARRAY
public class FindLocationOfElementinArray {
	
public static void main(String[] args) {
	int []arr = {1,2,3,4,5,6,7,8,9,0};
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the Element to find");
	int elementToFind = scanner.nextInt();
	scanner.close();
	
	int location= findElementLocation(arr, elementToFind);
	
	System.out.println("Element "+elementToFind+" location of the elemenet "+location);
	System.out.println("Array index start from 0 its means "+location+"th index of the address");
}
static int findElementLocation(int[] arr , int element) {
	for(int i = 0 ; i<arr.length;i++) {
		if(element==arr[i]) {
			return i;
		}
	}
	return -1;//element not found 
	
}
}
