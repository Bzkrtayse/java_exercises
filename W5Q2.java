package week5;
//The first method, getArray(), returns a two-dimensional array and the second method,
//sum(int[][] m), returns the sum of all the elements in a matrix.

import java.util.Scanner;

/**
 *
 * @author Ayşe Bozkurt
 */
public class Week5 {

    public static void main(String[] args) {
        int[][] matrix = getArray();
        int sum = sum(matrix);
        System.out.println("Sum of all elements: " + sum);
    }

    //initialize an array with the user inputs
    public static int[][] getArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter row and column size: ");
        int row = input.nextInt();
        int column = input.nextInt();
        int[][] matrix = new int[row][column];
        System.out.println("Enter the array items");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
        return matrix;
    }

    //sum all the elements
    public static int sum(int[][] matrix) {
        int total = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                total += matrix[i][j];
            }
        }
        return total;
    }
}
