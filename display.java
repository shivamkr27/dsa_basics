//Q2: Write a program to input two numbers and display their sum, difference, product, and quotient.

/*
Sample Test Cases:
Input 1:
10 2
Output 1:
Sum=12, Diff=8, Product=20, Quotient=5

Input 2:
7 3
Output 2:
Sum=10, Diff=4, Product=21, Quotient=2

*/
import java.util.*;
public class display{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int a = scn.nextInt();
int b = scn.nextInt();
System.out.println("Sum="+(a+b) +", "+"diff="+(a-b) +", "+"Product="+(a*b) +", " +"quotient="+(a/b)    );
  }
}