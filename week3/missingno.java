package week3;

import java.util.Scanner;

public class missingno {
  public static void main (String[] args){

    Scanner sc = new Scanner(System.in);

        System.out.println("Enter length:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        // nput loop ONLY for input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // for(int i=0;i<n;i++) unnecessaryloop
        
          int sna=(n *(n+1))/2;
        
        int sumarr=0;
        for (int i=0;i<n;i++){
          sumarr=sumarr+arr[i];
        }
        int sum=sna -sumarr;
          System.out.println("the missing ele:" +sum);
        

        
}
}