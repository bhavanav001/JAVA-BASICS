import java.util.Scanner;

  public class cal{
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the num1:");
      double num1=sc.nextDouble();
      System.out.println("enter the num2:");
      double num2=sc.nextDouble();
      System.out.println("enter the operation(+,*,/,-):");
      char op =sc.next().charAt(0);
      switch(op){
        case '+':
          System.out.println("result:"+(num1+num2));
          break;
        case '-':
          System.out.println("result:"+(num1-num2));
          break;
        case '*':
          System.out.println("result:"+(num1*num2));
          break;  
        case '/':
          if(num2 !=0)
            System.out.println("result:"+(num1/num2));
        else
          System.out.println("error");
        break;
        default:
          System.out.println("invalid operator");
      }
      sc.close();
    }
  }
// we can use switch(choice)

