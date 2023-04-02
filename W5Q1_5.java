package week5;
//Summing elements by column.

/**
 *
 * @author Ayşe Bozkurt
 */
public class Week5 {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3}, {7, 4, 9}, {3, 4, 2}};
        System.out.println("two-dimensional array: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix[0].length; i++) {
            int total = 0;
            for (int j = 0; j < matrix.length; j++) {
                total += matrix[j][i];
            }
            System.out.println("sum of column " + i + " is: " + total);
        }
    }

}
