package week3;
import java.util.Random;
import java.util.Scanner;
public class Week3 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner myobj= new Scanner(System.in);
        int number = rnd.nextInt(900) + 100;
        char[] cnumber = String.valueOf(number).toCharArray();
        System.out.println(cnumber);
        System.out.println("Enter your guess: ");
        int predictedNumber= myobj.nextInt();
        char[] cpredicted = String.valueOf(predictedNumber).toCharArray();
        
        if (predictedNumber<100 || predictedNumber>999){
            System.out.println("Enter a 3 digit number!!!");
        }
        int counter=0;
        for (int i =0; i<3;i++){
            for(int j=0;j<3;j++){
             if (cpredicted[i]==cnumber[j])
                   counter++;}
              
        }
        if (counter==3 && predictedNumber==number){
            System.out.println("You win!!! Number to be predicted is "
                +number+"\nExact match: you win 10,000TL");
        }
        
        if (counter==3 && predictedNumber!=number){
            System.out.println("You win!!! Number to be predicted is "
                +number+"\nThree match: you win 3,000TL");
        }
        if (counter==2){
            System.out.println("You win!!! Number to be predicted is "
                +number+"\nTwo match: you win 1,000TL");
        }
    }
    
}
