import java.util.Scanner;

public class armstrong {
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int count=0;
    double sum=0;
    int temp=n;
    while(temp>0){
      count++;
      temp=temp/10;
    }
    temp=n;
    while(temp>0){
      int digit=temp%10;
      sum=sum+Math.pow(digit,count);
      temp=temp/10;
    }
    if(sum==n){
      System.out.println("Armstrong number");
    }
    else{
      System.out.println("Not an Armstrong number");
    }
    sc.close();
  }

}
