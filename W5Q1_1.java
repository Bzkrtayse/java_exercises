package week5;

import java.util.Scanner;
//Initializing arrays with input values.

/**
 *
 * @author Ayşe Bozkurt
 */
public class Week5 {

    public static void main(String[] args) {
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
        System.out.println("matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
