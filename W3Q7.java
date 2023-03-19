package week3;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
public class Week3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rnd =new Random();
        int sub, answer, num1,num2;
        String str="";
        long start=new Date().getTime();
        for(int i=0;i<5;i++){
        num1=rnd.nextInt(10);
        num2=rnd.nextInt(10);
        System.out.printf("\nWhat is %d - %d ?",num1,num2);
        sub=num1-num2;
        answer=input.nextInt();
        boolean flag=true;
        if(sub==answer){
            flag=true;
            System.out.println("You are correct!");
        }
        if(sub!=answer){
            flag=false;
            System.out.printf("Your answer is wrong.\n%d - %d should be %d",num1,num2,(num1-num2));
            }
        String s1 = String.valueOf(num1);
        String s2 =String.valueOf(num2);
        String subt =String.valueOf(sub);
        String val =String.valueOf(flag);
        str+= s1+"-"+s2+"="+subt+val+"\n";
        }
        long end= new Date().getTime();
        long difference = end-start;
        System.out.println("-------------------");
        System.out.println("Test time is "+ difference/1000 + " seconds");
        System.out.println( str);
}
}
