package week3;
import java.util.Scanner;
public class Week3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter first integer: ");
        int num1=input.nextInt();
        System.out.println("Enter second integer: ");
        int num2=input.nextInt();
        int min=num1;
        int gcd=1;
        if(num1>num2){min=num2;}
        for(int i =1; i<=min;i++){
            if(num2%i==0 && num1%i==0){
               gcd=i;
            }
        }
        System.out.printf("The greatest common divisor for %d and %d is %d",num1,num2,gcd);
}
}
