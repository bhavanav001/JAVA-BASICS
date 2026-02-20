import java.util.Scanner;

public class magicno {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter a number");
     int num=sc.nextInt();
     while(num>9){
      int sum=0;
      while(num>0){
        sum+=num % 10;
        num/=10;

      }
      num = sum;
     }
     if(num ==1)
      {
        System.out.println("Magic number");
      }
      else{
        System.out.println("Not a magic number");
      }
  }
  
}
