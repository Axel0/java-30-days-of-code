import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    /* Given a base- integer, , convert it to binary (base-). Then find and print the base- integer denoting the maximum number of consecutive 's in 's binary representation. */
     
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s=0,t=0;


        while(n>0){
        
            n=n/2;

            if(n%2==1){
               
               s++;
                
                if(s>=t)

                    t=s;
            }
            
            else{

                s=0;
            }   
        }

        System.out.println(t);
    }
}