package week5;
//Initializing arrays with random values.

import java.util.Random;

/**
 *
 * @author Ayşe Bozkurt
 */
public class Week5 {

    public static void main(String[] args) {
        Random rnd = new Random();
        int[][] matrix = new int[10][10];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rnd.nextInt(10);
            }
        }
        System.out.println("randomly created matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
