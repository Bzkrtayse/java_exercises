package week3;
public class Week3 {
    public static void main(String[] args) {
       double pi = 0.0;
    
    for (double i = 1; i < 100000000; i++) {
        pi += (Math.pow((-1), (i+1))/(2*i-1));
    }
    
    System.out.println(pi * 4);
    System.out.println(Math.PI);
    
    }
    
}
       