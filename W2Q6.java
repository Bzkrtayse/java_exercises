import java.util.Scanner;
public class JavaW2 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter retrieval amount: ");
        double retrivalUser = myObj.nextDouble();
        
        int retrival=(int)retrivalUser;
        double kurus=retrivalUser-(double)retrival;
        int given200=(retrival/200);
        int given100=(retrival-given200*200)/100;
        int given50=(retrival-(given200*200+given100*100))/50;
        int given20=(retrival-(given200*200+given100*100+given50*50))/20;
        int given10=(retrival-(given200*200+given100*100+given50*50+given20*20))/10;
        int given5=(retrival-(given200*200+given100*100+given50*50+given20*20+given10*10))/5;
        int given1=(retrival-(given200*200+given100*100+given50*50+given20*20+given10*10+given5*5));
        int given50krs=(int)(kurus/0.50);
        int given25krs=(int)((kurus-(given50krs*0.50))/0.25);
        
        System.out.printf("Monetary units to be given: %d x 200TL + %d x 100TL +%d x 50TL +"
                + " %d x 20TL + %d x 10TL +%d x 5TL + %d x 1TL +%d x 50krs + %d x 25krs  ",given200,given100,given50,given20,given10,given5,given1,given50krs,given25krs);
    }   
}
