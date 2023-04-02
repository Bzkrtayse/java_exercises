package week5;
//print a two-dimensional array.

/**
 *
 * @author Ayşe Bozkurt
 */
public class Week5 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {7, 8, 9}, {3, 4, 5}, {6, 7, 8}};
        System.out.println("two-dimensional array: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
