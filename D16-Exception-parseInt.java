import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/* Read a string, , and print its integer value; if  cannot be converted to an integer, print Bad String. */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            int n=Integer.parseInt(S);
            System.out.println(n);
            
        } catch (NumberFormatException e){
            System.out.println("Bad String");
        }
    }
}