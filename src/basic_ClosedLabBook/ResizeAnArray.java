package basic_ClosedLabBook;

import java.util.ArrayList;

public class ResizeAnArray {
	
	    public static void main(String[] args) {
	    	//create an arraylist
	    	ArrayList<Integer> arr = new ArrayList<>();
	    	//store a value in arraylist
	    	arr.add(1);
	    	arr.add(2);
	    	arr.add(3);
	    	arr.add(4);
	    	arr.add(5);
	    	
	    	//print original array list
	    	System.out.println("Print ArrayList " + arr); // output 1,2,3,4,5
	    	int resizeArray = 8;
	    	
	    	// resize an arraylist
	    	while(arr.size()<resizeArray) {
	    		int num = arr.size();
	    		arr.add(num+1); // output 6,7,8
	    	}
	    	System.out.println("resized ArrayList " + arr);
	    }
	    }



