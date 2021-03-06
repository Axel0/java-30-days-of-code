import java.util.*;

/* You are given two classes, Person and Student, where Person is the base class and Student is the derived class. Completed code for Person and a declaration for Student are provided for you in the editor. Observe that Student inherits all the properties of Person.

Complete the Student class by writing the following:

A Student class constructor, which has  parameters:
A string, .
A string, .
An integer, .
An integer array (or vector) of test scores, .
A char calculate() method that calculates a Student object's average and returns the grade character representative of their calculated average */

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private String firstName, lastName;
    private int id;
    private int[] testScores;
    
    Student (String firstName, String lastName, int id, int[] scores){
        super(firstName, lastName, id);
        this.firstName=firstName;
        this.lastName=lastName;
        this.id=id;
        this.testScores=scores;
    }
    
    public char calculate(){
        int sum=0;
        float average=0;
        char c='0';
        for (int i=0; i<testScores.length; i++){
            
            sum=sum+this.testScores[i];
            
        }
        
        average=sum/testScores.length;
        
        if (average<40){
            
            c='T';
            
        }
        else if(average>=40 & average<55){
            c= 'D';
        }
        
        else if (average>=55 & average<70){
            c= 'P';
        }
        else if (average>=70 & average<80){
            c= 'A';
        }
        else if (average>=80 & average<90){
            c= 'E';
        }
        else if (average>=90 & average<=100){
            c = 'O';
        }
        
        return c;
    }
    
    
    
    
}



class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}