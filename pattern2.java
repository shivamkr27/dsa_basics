import java.util.*;
public class pattern2{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
for(int i=1;i<=n;i++){
  for(int j=i;j<=n-1;j++){
    System.out.print("\t");
  }
  for(int k=1;k<=i;k++){
    System.out.print("*\t");
  }
  System.out.println("");
}


  }
}