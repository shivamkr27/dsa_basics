import java.util.*;
 public class numberalign{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int number = scn.nextInt();
    int y;
    while(number !=0){
      y=number%10;
      System.out.println(y);
      number =number/10;
    }
  }
 }