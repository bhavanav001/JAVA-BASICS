public class uglyno {
  public static void main (String[] args)
{
  int n=14;
  if(n<=0){
    System.out.print("not a ugly no");
    }
    while(n %2==0){
      n=n/2;
    }
    while(n %3==0){
      n=n/3;
}  
while(n %5==0){
      n=n/5;
}

if(n==1){
  System.out.print("ugly no");
}
else{
  System.out.print("not a ugly no");
}
}
}

