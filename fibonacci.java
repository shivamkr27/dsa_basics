import java.util.*;
 public class fibonacci{
   public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int till =  scn.nextInt();
    int a=0;
    int b=1;
    
    for(int i=0;i<till;i++){
      System.out.print(a);
      int sum=a+b;
      
      a=b;
      b=sum;
      
    }
   }
 }