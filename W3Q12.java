package week3;
public class Week3 {
    public static void main(String[] args) {
  
       int sum=0;
       int num=1;
       while(num<10000){
        for(int j=1; j<num; j++){
        if(num % j==0){
            sum=sum+j;}
        }
        if(sum==num){ System.out.println(num);}
        sum=0;
        num++;
        }   
    }
    
}
       