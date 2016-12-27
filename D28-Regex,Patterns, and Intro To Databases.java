import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Consider a database table, Emails, which has the attributes First Name and Email ID. Given  N rows of data simulating the Emails table, print an alphabetically-ordered list of people whose email address ends in .



public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<String> names = new ArrayList<String>();
        for(int a0 = 0; a0 < N; a0++){
            String firstName = in.next();
            String emailID = in.next();
          
            if(check(firstName, emailID)){
                
                names.add(firstName);
                
    
            } else{
                continue;
            }
        }
            
            String[] array = names.toArray(new String[names.size()]);
            Arrays.sort(array);
            for (int j=0; j<names.size(); j++){
                
                System.out.println(array[j]);
            
        }
    }
    public static boolean check(String Name, String Email){
        
        boolean ismail = Email.endsWith("@gmail.com") && Pattern.matches("\\D{1,50}",Email);
        boolean name= Pattern.matches("\\w{1,20}",Name) && Pattern.matches("^[a-z]*$",Name);
        boolean a=false;
        if (ismail && name){
            a=true;
        }
       
        return a;
        
        
    }
 
    
    
}