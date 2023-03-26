package week4;
/*
* Ayse Bozkurt
*/
// Craps is a popular dice game played in casinos. Write a program to play a variation of the game, as
// follows: Roll two dice. Each dice has six faces representing values 1, 2, . . ., and 6, respectively. Check
// the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you lose; if the sum is 7 or 11 (called
// natural), you win; if the sum is another value (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue
// to roll the dice until either a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you
// win.
import java.util.Random;

public class week4Q2 {

    public static void main(String[] args) {
        result();
    }

    public static int diceSum() {
        Random rnd = new Random();
        int dice1 = rnd.nextInt(5) + 1;
        int dice2 = rnd.nextInt(5) + 1;
        int sum = dice1 + dice2;
        System.out.printf("\nYou rolled %d + %d = %d", dice1, dice2, sum);
        return sum;
    }

    public static void result() {
        int sum, newSum;
        int point = 0;
        switch (sum = diceSum()) {
            case 2:
            case 3:
            case 12:
                System.out.println("\nYou lose");
                break;
            case 7:
            case 11:
                System.out.println("\nYou win!");
                break;
            default:
                point = sum;
                System.out.println("\npoint: " + point);
        }
        while (point != 0) {
            newSum = diceSum();
            if (newSum == 7) {
                System.out.println("\nYou lose");
                break;
            }
            if (newSum == point) {
                System.out.println("\nYou win!");
                break;
            }

        }
    }
}
