package week3;
import java.util.Scanner;
public class Week3 {
    public static void main(String[] args) {
       
        Scanner myobj= new Scanner(System.in);
        System.out.println("enter binary digits: ");
        int binary = myobj.nextInt();
        String str=Integer.toString(binary);
        int length=str.length();
        int decimal =0;
        int counter=0;
        for ( int i =1; i <= length; i++){
            if (binary%10==0){
                decimal+=0;
            }
            else if(binary%10==1){
                decimal+=Math.pow(2, counter);
            }
            binary=binary/10;
            counter++;
        }     
        System.out.println("The decimal value is: "+decimal);
}
}
