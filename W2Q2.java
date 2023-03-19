public class JavaW2 {

    public static void main(String[] args) {
       //3.4x + 50.2y = 44.5
       //2.1x + 55y = 5.9
       double a=3.4;
       double b=50.2;
       double c=2.1;
       double d=55;
       double e=44.5;
       double f=55;
       double x=(e*d-b*f)/(a*d-b*c);
       double y=(a*f-e*c)/(a*d-b*c);
       System.out.println("x ="+x+"\ny ="+y);
    }   
}