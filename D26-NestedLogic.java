import java.io.*;
import java.util.*;
/*Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:

If the book is returned on or before the expected return date, no fine will be charged (i.e.: fine=0) .
If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, fine=15 Hackos x (numbers of days late).
If the book is returned after the expected return month but still within the same calendar year as the expected return date, the fine= 500 Hackos x (numbers of months late).
If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10000 Hackos.
*/

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int Da = in.nextInt();
        int Ma = in.nextInt();
        int Ya = in.nextInt();
        int De = in.nextInt();
        int Me = in.nextInt();
        int Ye = in.nextInt();
        in.close();
        int fee=0;
        int daysLate=(Da-De);
        int monthsLate=Ma-Me;
        int yearsLate=Ya-Ye;
       
        if (yearsLate==0){
            if (monthsLate==0){
                if (daysLate>0){
                    fee=15*daysLate;
                }
            }
            else if (monthsLate>0){
                fee=500*monthsLate;
            }
        }
        else if(yearsLate>0){
            fee=10000;
        }
        
        System.out.println(fee);
      
}
}