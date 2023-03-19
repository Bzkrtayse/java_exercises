package javaw2;
import java.util.Scanner;
public class JavaW2 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter a number");

        int number = myObj.nextInt();
        int multiplication = 0;
        while(number<1000 && number>0)
        {
        if (number>0 && number<100){
            multiplication=number%10*number/10;
        }
        else
            multiplication=number%100*number%10*number/100;
        }
        System.out.println("The multiplication of all digits in " + number
        +"is"+multiplication); 
    }   
}
