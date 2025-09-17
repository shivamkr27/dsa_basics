import java.util.*;
public class reverse{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
System.out.println("enter the number to be reversed: ");
int number = scn.nextInt();

while( number>0){
int remainder =number%10;
number =number/10;
System.out.println(remainder);

}

  }
}