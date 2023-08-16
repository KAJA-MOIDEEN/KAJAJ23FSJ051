package basic_ClosedLabBook;

import java.util.Arrays;
/*19. Write a program to reverse the elements of each row in a two dimensional array*/

public class ReversTowDArray {

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        
        reverseArrayRows(array);
        
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
    
    public static void reverseArrayRows(int[][] array) {
        for (int[] row : array) {
            int left = 0;
            int right = row.length - 1;
            
            while (left < right) {
                int temp = row[left];
                row[left] = row[right];
                row[right] = temp;
                
                left++;
                right--;
            }
        }
    }
}
