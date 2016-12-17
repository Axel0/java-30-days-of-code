import java.io.*;
import java.util.*;
/*BUBBLE SORT */
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
        int[] a= new int[n];
        int numberOfSwap=0;
        
        /*Populating Array */
        for (int h=0; h<n; h++){
            a[h]=in.nextInt();
        }
        /* Sorting */
        for (int i=0; i<n; i++){
            for (int j=0; j<n-1; j++){
            
            if (a[j]>a[j+1]){
                int t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
                
                numberOfSwap++;
            }
        }
             if (numberOfSwap == 0) {
        break;
     }
 }
      /*Printing */
        System.out.printf("Array is sorted in %d swaps.\nFirst Element: %d\nLast Element: %d", numberOfSwap, a[0],a[n-1]);
        
        
        
   }
}