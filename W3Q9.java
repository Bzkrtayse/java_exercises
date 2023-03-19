package week3;
import java.util.Scanner;
public class Week3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter tuition amount: ");
        int tution=input.nextInt();
        System.out.println("Enter yearly increase percentage:");
        int percentage=input.nextInt();
        int tutionfuture=tution+(percentage/100*tution);
        int counter=0;
        while(tutionfuture<2*tution){
            tutionfuture+=tutionfuture*percentage/100;
        counter++;
        }
        if(tutionfuture>=tution*2){
        System.out.printf("Tuition will be doubled in %d years",counter);
        System.out.printf("\nTuition will be $ %d in %d years",tutionfuture,counter);
        }
        
}
}

