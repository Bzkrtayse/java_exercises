package week3;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Week3 {
    public static void main(String[] args) {
        Scanner myobj=new Scanner(System.in);
        System.out.println("Enter employee's name: ");
        String name = myobj.next();
        System.out.println("Enter number of hours worked in a week:");
        double payRate,federal,workedHours,state,stateTax,federalTax,grossPay,netPay,totalDeduction;
        workedHours=myobj.nextDouble();
        System.out.println("Enter hourly pay rate:");
       
        payRate = myobj.nextDouble();
        System.out.println("Enter Federal tax withholding rate:");
        federal=myobj.nextDouble();
        System.out.println("Enter State tax withholding rate:");
        state=myobj.nextDouble();
       
        grossPay=workedHours*payRate;
        federalTax=federal*grossPay;
        stateTax=state*grossPay;
        totalDeduction=federalTax+stateTax;
        netPay=grossPay-totalDeduction;
        
        
        System.out.println("Employee Name:"+name);
        System.out.printf("Hours Worked:%f \nPay Rate:%f\nGross Pay:%f\nDeductions:\n\tFederal Withholding:%f \n\tState Witholding:%f \n\tTotal Deduction:%f\nNet Pay:%f",
                workedHours,payRate,grossPay, federalTax,stateTax,totalDeduction,netPay);
}}
