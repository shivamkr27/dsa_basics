import java.util.*;
import java.util.Scanner;
 public class prime{
  public static void main(String[] args){
    
Scanner scn = new Scanner(System.in);

int t = scn.nextInt();


for(int i=1;i<=t;i++){
  
  int n = scn.nextInt();
  int count =0;
  
for(int div =2;div*div<=n;div++){
    if(n%div ==0){
      
      count++;
      break; 
    }
  }
  if(count ==0){
    System.out.println(n + " is a  prime number");
  }
  else{
    System.out.println(n + " is not a prime number");
  }
}

  }
 };