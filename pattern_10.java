import java.util.*;
public class pattern_10{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
  
  int space =n/2;
  int star =1;
   int value =1;
   for(int i=1;i<=n;i++){
    for(int j=1; j<=space;j++){
      System.out.print("\t");
    }
     int cval =value;
     for(int j=1;j<=star;j++){
      System.out.print(cval +"\t");
if(j<=star/2){
  cval++;}
  else {
    cval--;
  }
}
if(i<=n/2){
  space--;
  star +=2;
  value++;
}
else{
  space++;
  star -=2;
  value--;
}

System.out.println();



     }

   }
   
       
    }


  
    
