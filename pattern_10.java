import java.util.*;
public class pattern_10{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
  
  
        // Upper half including middle
        for (int i = 1; i <= n / 2 + 1; i++) {
            // Print leading spaces
            for (int s = 1; s <= (n / 2 + 1 - i); s++) {
                System.out.print("  ");
            }

            // Increasing numbers
            for (int j = i; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
            }

            // Decreasing numbers
            for (int j = 2 * i - 2; j >= i; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        // Lower half (mirror of upper half, excluding middle)
        for (int i = n / 2; i >= 1; i--) {
            // Print leading spaces
            for (int s = 1; s <= (n / 2 + 1 - i); s++) {
                System.out.print("  ");
            }

            // Increasing numbers
            for (int j = i; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
            }

            // Decreasing numbers
            for (int j = 2 * i - 2; j >= i; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

  
    
