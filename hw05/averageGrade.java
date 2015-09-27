//A program to calculate the average of all user-input grades.
//
//@author Kaitlyn Hennessy
//@version 9/26/15
//
import java.util.Scanner;//Import scanner class
public class averageGrade{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in); //Create scanner object
        int timesRun=0; //Variable to use to see if initial instructions are needed.
        int gradeTotal=0; //Total of all collected grades.
        int numberGrades=0; //Number of grades collected.
        int averageGrade; //Average of the grades
        int newGrade=0; //Newly taken grade.
        
        if (timesRun==0){ //When valid, will provide user with intial instructions.
            System.out.println("This program will calculate the average of the entered grades. \nWhen done, enter the value 999 to obtain the average.");
             newGrade=scan.nextInt(); //Take the user's input.
             timesRun++; //Prevent from giving initial instructions again.
        }
        while (newGrade!=999){ //Check to ensure the loop should still run.
            if ((newGrade>=0)&&(newGrade<=100)){ //Check that the grade is valid.
                gradeTotal+=newGrade;//Update the sum of the grades.
                numberGrades++; //Update the number of grades taken.
                System.out.println("Enter a grade between 0 and 100.  Enter 999 to receive the average.");
                newGrade=scan.nextInt(); //Take user's next input.
             }
             else{//Respond to invalid entry
                System.out.println("Invalid entry.\nEnter a grade between 0 and 100.\nEnter 999 to receive the average.");
                newGrade=scan.nextInt();//Take user's next input.
            }
        }
        averageGrade=gradeTotal/numberGrades;//Calculate the average of the grades.
        System.out.println("Total of all grades: "+gradeTotal+"\nNumber of grades collected: "+numberGrades+"\nAverage of grades: "+averageGrade);
    }
}