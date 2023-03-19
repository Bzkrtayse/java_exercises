package week3;
import java.util.Random;
import java.util.Scanner;
public class Week3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rnd =new Random();
        
        int magicNum=rnd.nextInt(100);
        System.out.println(magicNum);
 
        System.out.printf("Guess a magic number between 0 and 100\nEnter your guess: ");
        int guess=input.nextInt();
        while (magicNum!=guess){
            if (magicNum>guess)
        System.out.printf("Your guess is too low\nEnter your guess: ");
            else if (magicNum<guess)
        System.out.printf("Your guess is too high\nEnter your guess: ");
        guess=input.nextInt();
        }
        if (magicNum==guess)System.out.println("Yes,the number is: "+magicNum);
        
}
}
