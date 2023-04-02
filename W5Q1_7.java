package week5;
//shuffle all the elements in a two-dimensional array

/**
 *
 * @author Ayşe Bozkurt
 */
public class Week5 {

    public static void main(String[] args) {

        //print the array to screen.
        int[][] matrix = {{64, 17, 10}, {81, 11, 19}, {13, 25, 45}};
        System.out.println("two-dimensional array:\n ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        //shuffling array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                int i1 = (int) (Math.random() * matrix.length);
                int j1 = (int) (Math.random() * matrix[i].length);
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i1][j1];
                matrix[i1][j1] = temp;
            }
        }
        //print the shuffled array
        System.out.println("\nshuffled array:\n ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
