//Q4: Write a program to calculate the area and circumference of a circle given its radius.

/*
Sample Test Cases:
Input 1:
7
Output 1:
Area=153.94, Circumference=43.96

Input 2:
3
Output 2:
Area=28.27, Circumference=18.85

*/
import java.util.*;
public class circle{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    double pi =3.14;
    double radius = scn.nextDouble();
System.out.println("area="+(pi*radius*radius) + ", " +"circumference="+(2*pi*radius));
  }
}