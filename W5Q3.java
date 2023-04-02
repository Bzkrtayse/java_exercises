package week5;
//Your program grades the test and displays the result. It compares each student’s answers
//with the key, counts the number of correct answers, and displays it.

import java.util.Scanner;

/**
 *
 * @author Ayşe Bozkurt
 */
public class Week5 {

    public static void main(String[] args) {
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
            {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
            {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
            {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        //key to the questions
        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        //check the answers and store the correct answer count for each student
        int counter = 0;
        for (int i = 0; i < answers.length; i++) {
            counter = 0;
            for (int j = 0; j < answers[0].length; j++) {
                if (answers[i][j] == keys[j]) {
                    counter++;
                }
            }
            System.out.println("Student " + i + "'s correct count is " + counter);
        }
    }
}
