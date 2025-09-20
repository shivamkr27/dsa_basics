import java.util.*;
public class xpattern{
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

for(int i=1;i<=n;i++){
  for( int j=1;j<=n;j++){
    if( i==j || i+j==n+1 ){
      // i==j 11,22,33 left to right diagonal k liye hai
      // i+j=n+1  -  1+7 = 7+1  - ye i jitna rhega utna piche se hat k print
      System.out.print("*");
    }
    else{
      System.out.print(" ");
    }
  }
  System.out.println();
}



  }
}