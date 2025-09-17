import java.util.*;
 public class primetill{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
  int low = scn.nextInt();
  int high = scn.nextInt();
  int primecount=0;
  for (int i=low;i<=high; i++){
    int count =0;
    for(int div =2;div*div <=i;div++){
      if(i%div ==0){
        count++;
        break;
      }
    }
    if (count ==0){
      System.out.println("prime" +i);
    primecount++;}
      else{
        System.out.println("not prime" +i);}
    }
   
  System.out.println("total prime numbers between the range are: " +primecount);
  }
  
 }