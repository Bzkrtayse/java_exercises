package week4;
//Write a method that finds the number of occurrences of a specified character in a string using the
//following header:
//For example, count("Welcome", 'e') returns 2. Write a test program that prompts the user to enter a
//string followed by a character then displays the number of occurrences of the character in the string.
//public static int count (String str, char ch)

import java.util.Scanner;

/**
 *
 * @author Ayşe BOZKURT
 */
public class week4Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.next();
        System.out.println("Enter a char: ");
        char ch = input.next().charAt(0);
        System.out.println(count(str, ch));
    }

    public static int count(String str, char ch) {
        int length = str.length();
        int start = 0;
        int counter = 0;
        for (int i = 0; i < length; i++) {
            i = str.indexOf(ch, start);
            if (i >= 0) {
                counter++;
                start = i + 1;
            } else {
                break;
            }
        }
        return counter;
    }
}
