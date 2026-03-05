package week3;
import java.util.*;

class Tripletcount {
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
        int count = 0;
        for(int i=0;i<n;i++){
          for ( int j=i+1;j<n;j++){
            int sum=arr[i]+arr[j];
          for ( int k=0;k<n;k++){
            if(arr[k] == sum && k!=i & k!=j){
              count =count + 1;
            }

          }
          }
        
      }
System.out.println("Triplet count = " + count);
  }
  
}
