package week5;

import java.util.Scanner;
//sorting array

/**
 *
 * @author Ayşe Bozkurt
 */
public class Week5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //take array size
        System.out.println("Enter array size: ");
        int size = input.nextInt();
        //initilaize array
        int[] array = new int[size];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        //copy array
        int[] sortedArr = new int[size];
        System.arraycopy(array, 0, sortedArr, 0, size);
        //sort the copied array
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (sortedArr[j] > sortedArr[j + 1]) {
                    int temp = array[j];
                    sortedArr[j] = sortedArr[j + 1];
                    sortedArr[j + 1] = temp;
                }
            }
        }
        if (isSorted(sortedArr, array) == true) {
            System.out.println("Array is sorted ");
        } else {
            System.out.println("Array is not sorted ");
        }
    }

    public static boolean isSorted(int[] sortedArr, int[] array) {
        //store the number of equal elements
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == sortedArr[i]) {
                counter++;
            }
        }
        return array.length == counter;
    }
}
