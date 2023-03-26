package week4;
/**
 *
 * @author Ayşe BOZKURT
 */
public class week4Q2 {

    public static void main(String[] args) {
        isTwinPrime();
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void isTwinPrime() {
        for (int i = 3; i < 1200; i++) {
            if (isPrime(i) == true && isPrime(i + 2) == true) {
                System.out.println("(" + i + "," + (i + 2) + ")");
            }
        }
    }

}
