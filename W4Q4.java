package week4;
//An emirp (prime spelled backward) is a nonpalindromic prime number whose reversal is also a
//prime. For example, 17 is a prime and 71 is a prime, so 17 and 71 are emirps. Write a program that
//displays the first 120 emirps. Display 10 numbers per line, separated by exactly one space, as follows:
//13	17	31	37	71	73	79	97	107	113
//149	157	167	179	199	311	337	347	359	389
//701	709	733	739	743	751	761	769	907	937

/**
 *
 * @author Ayşe BOZKURT
 */
public class week4Q2 {

    public static void main(String[] args) {
        isEmirp();
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void isEmirp() {
        int counter = 0;
        int number = 10;
        while (counter < 120) {
            if (isPrime(number) == true && isPrime(backward(number)) == true && isPolindrom(number) == false) {
                counter++;
                System.out.print(number + "\t");
                if (counter % 10 == 0) {
                    System.out.println();
                }
            }
            number++;
        }
    }

    public static int backward(int number) {
        //number abcd
        //backward dcba
        int bw = 1;
        if (number > 999 && number < 9999) {
            int a = number / 1000;
            int b = (number / 100) % 10;
            int c = (number / 10) % 10;
            int d = number % 10;
            bw = d * 1000 + c * 100 + b * 10 + a;
        }

        //number abc
        //bw cba
        if (number > 100 && number < 999) {
            int a = number / 100;
            int b = (number / 10) % 10;
            int c = number % 10;
            bw = c * 100 + b * 10 + a;
        }

        //number ab
        //bw ba
        if (number < 100) {
            int a = number / 10;
            int b = number % 10;
            bw = b * 10 + a;
        }
        return bw;
    }

    public static boolean isPolindrom(int number) {
        //number abcd
        if (number > 999 && number < 9999) {
            int a = number / 1000;
            int b = (number / 100) % 10;
            int c = (number / 10) % 10;
            int d = number % 10;
            return a == d && b == c;
        }
        //number= abc
        if (number > 99 && number < 1000) {
            int a = number / 100;
            int c = number % 10;
            return a == c;
        }
        if (number < 100) {
            int a = number / 10;
            int b = number % 10;
            return a == b;
        }
        return true;
    }

}
