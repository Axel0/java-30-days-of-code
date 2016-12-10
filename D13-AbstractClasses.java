/*Given a Book class and a Solution class, write a MyBook class that does the following:

Inherits from Book
Has a parameterized constructor taking these 3 parameters:
string 
string 
int 
Implements the Book class' abstract display() method so it prints these  lines:
Title:, a space, and then the current instance's title.
Author:, a space, and then the current instance's author.
Price:, a space, and then the current instance's price. */
import java.util.*;
abstract class Book
{
    String title;
    String author;
    Book(String t,String a){
        title=t;
        author=a;
    }
    abstract void display();


}

class MyBook extends Book{
    int p;
    
    
    MyBook(String title, String author, int price){
        
        super(title, author);
        p=price;
        
        
        
        
    }
    
    void display(){
        
        System.out.printf("Title: %s\n",title);
        System.out.printf("Author: %s\n",author);
        System.out.printf("Price: %s\n",p);


        
        
        
    }
    
}

public class Solution
{
   
   public static void main(String []args)
   {
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      String author=sc.nextLine();
      int price=sc.nextInt();
      Book new_novel=new MyBook(title,author,price);
      new_novel.display();
      
   }
}