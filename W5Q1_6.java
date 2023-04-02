package week5;
//Which row has the largest sum?

/**
 *
 * @author Ayşe Bozkurt
 */
public class Week5 {

    public static void main(String[] args) {

        //print the array to screen.
        int[][] matrix = {{13, 17, 10}, {17, 11, 19}, {13, 25, 12}};
        System.out.println("two-dimensional array:\n ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //take the sum of each row and find the max sum
        int max = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            int total = 0;
            for (int j = 0; j < matrix.length; j++) {
                total += matrix[i][j];
                if (total > max) {
                    max = total;
                }
            }
            System.out.println("\nsum of row " + i + " is: " + total);
        }
        System.out.println("\nmax row total is " + max);
    }
}
