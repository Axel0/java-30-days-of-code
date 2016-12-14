import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
 /* Find the maximum absolute difference between any 2 numbers in N and stores it in the maximumDifference instance variable. */

class Difference {
  	private int[] elements;
  	public int maximumDifference;

  	Difference(int[] elements){
        this.elements=elements;
        
        
    }


    void computeDifference(){
        for (int i=0; i<elements.length; i++){
            for (int j=0; j<elements.length; j++){
                int n=Math.abs(elements[i]-elements[j]);
                if (n>maximumDifference){
                    maximumDifference=n;
                }
            }
        }
    }
}


public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}