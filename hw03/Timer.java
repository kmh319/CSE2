//A program to give how much time is left until dinner.
//
//@author Kaitlyn Hennessy
//@version 9/11/15

import java.util.Scanner;
public class Timer{
    public static void receiveValues(){ //Method to receive values from the user.
        Scanner myScanner=new Scanner(System.in); //Create scanner object
        System.out.print("Enter the current time (in military time): "); //Prompt user to provide current time.
        int currentTime=myScanner.nextInt(); //Save current time.
        System.out.print("Enter the time you will be eating dinner (in military time): "); //Prompt user to provide dinner time.
        int dinnerTime=myScanner.nextInt(); //Save dinner time.
        timeLeft(currentTime, dinnerTime); //Calls the method 'timeLeft'.
    }
    public static void timeLeft(int currentTime, int dinnerTime){ //Method to compute time left.
        int timeLeft=dinnerTime-currentTime; //Compute raw time left.
        int hoursLeft=timeLeft/100; //Compute hours left.
        int minutesLeft=timeLeft-(hoursLeft*100); //Compute minutes left.
        System.out.println("You have "+hoursLeft+" hours and "+minutesLeft+" minutes until dinner."); //Print results.
    }
    public static void main (String[] args){ //Main method.
        receiveValues(); //Calls the method 'receiveValues'.
    }
}