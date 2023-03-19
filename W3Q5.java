package week3;
import java.util.Random;
import java.util.Scanner;
public class Week3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rnd =new Random();
        
        int x=rnd.nextInt(10);
        int y=rnd.nextInt(10);
        
        int sum=x+y;
        
        System.out.printf("What is %d + %d ? ",x,y);
        int answer=input.nextInt();
        while (sum!=answer){
        System.out.printf("Wrong answer, Try again."+"What is %d + %d ? ",x,y);
        answer=input.nextInt();
        }
        if (answer==sum)System.out.println("You got it!");
        
}
}
