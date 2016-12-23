import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
 
        Scanner in = new Scanner(System.in);
        int h=in.nextInt();
        int[] n= new int[h];
        for (int i=0;i<h; i++){
            
            n[i]=in.nextInt();
            
            
            boolean PrimeOrNot=isPrime(n[i]);
            System.out.printf("%s\n",PrimeOrNot ? "Prime":"Not prime" );
        }
    }
    
 private static boolean isPrime(int num) {
        
        if (num == 1) {
            return false;
        } 
        
        for (int i = 2; i*i <= num; i++) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }
}


    
    