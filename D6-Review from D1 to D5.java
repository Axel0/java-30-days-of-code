import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */         Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        String t1,t2;
        for (int i=0; i<=n; i++){
            String S="";
            S=in.nextLine();
            t1=t2="";
            for (int j=0; j<S.length(); j++){
                
                if (j%2==0){
                    t1+=S.charAt(j);
                    
                }
                else {
                    t2+=S.charAt(j);
                }
                
                
               
            }
            System.out.println(t1+"  "+t2);
            
        }
       
    }
}