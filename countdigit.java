import java.util.*;
 public class countdigit{

  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
  int digit = scn.nextInt();

  int number =0;
  while( digit !=0){
digit =digit /10;
number ++;
  }
  System.out.println("the number of digits in the given number is: " +number);
  }
 }