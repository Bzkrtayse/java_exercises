import java.util.Scanner;
public class JavaW2 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter the minutes");

        int minutes = myObj.nextInt();
        int years = minutes/(60*24*365);
        int remainingDays=(minutes%(60*24*365))/(60*24);
        System.out.println(minutes+" minutes is approximately "+years+
                "years and"+remainingDays+"days");

    }   
}
