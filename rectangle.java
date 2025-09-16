//Q3: Write a program to calculate the area and perimeter of a rectangle given its length and breadth.

/*
Sample Test Cases:
Input 1:
5 10
Output 1:
Area=50, Perimeter=30

Input 2:
3 7
Output 2:
Area=21, Perimeter=20

*/
import java.util.*;
public class rectangle{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int length= scn.nextInt();
    int breadth =scn.nextInt();
    System.out.println("area="+(length*breadth) +" , "+"perimeter="+(2*(length+breadth)));
  }
}