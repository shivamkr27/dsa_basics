import java.util.*;
 public class combination_pattern{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n= scn.nextInt();

int sp=n/2;
int st=1;

for(int i=1;i<=n;i++){
  if(i<=n/2){
    sp--;
    st +=2;
    
  }
  else{
    sp++;
    st -=2;
  }
  for(int j=1;j<=sp;j++){
System.out.println("*");
  }
  for(int k=1;k<=st;k++){
    System.out.print("*");
  }
  
}

  }
 }