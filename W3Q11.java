package week3;

public class Week3 {

    public static void main(String[] args) {
        double e = 0.0;

        double fact = 1;
        for (double j = 1; j <= 10000; j++) {
            fact *= j;
            e += (1 / fact);
        }

        System.out.println(e);
    }

}
