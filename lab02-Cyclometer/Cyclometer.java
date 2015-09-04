//A program togive the time and rotation count of two cycling trips.
//
//Input the requested data to receive the information on the bike trips.
//
//@author Kaitlyn Hennessy
//@version 9/4/15
import java.util.Scanner;
public class Cyclometer{
    public static void main (String[] args){
        Scanner keyboard=new Scanner(System.in);
        //Collects data from the user to use in calculations.
        System.out.println("Please input how many seconds trip 1 was.");
        double secOne=keyboard.nextInt(); //How many seconds trip 1 was.
        System.out.println("Please input the number of counts from trip 1.");
        double cycOne=keyboard.nextInt(); //The number of cycles from trip 1.
        System.out.println("Please input how many seconds trip 2 was.");
        double secTwo=keyboard.nextInt(); //How many seconds trip 2 was.
        System.out.println("Please unput the number of counts from trip 2.");
        double cycTwo=keyboard.nextInt(); //The number of cycles from trip 2.
        System.out.println("#######################"); //Divider to make reading the results easier.
        
        //Predetermined variables for calculations and resulting information.
        double wheelDi=27.0; //Diameter of bike wheel
        double pi=3.14159; //Value for pi
        double feetPerMile=5280.0; //The number of feet in a mile.
        double inchesPerFoot=12; //The number of inches in a foot.
        double secPerMin=60; //The number of seconds in a minute.
        
        //Calculate the miles traveled for trip 1.
        double disTrip1=cycOne*wheelDi*pi; //Distance in inches
        disTrip1/=inchesPerFoot*feetPerMile;//Converts the distance to miles.
        
        //Calculate the miles traveled for trip 2.
        double disTrip2=cycTwo*wheelDi*pi; //Distance in inches
        disTrip2/=inchesPerFoot*feetPerMile; //Converts the distance to miles.
        double totDis= disTrip1+disTrip2; //Calculates total distance between the two trips.
        
        
        //Begin printing desired information.
        System.out.println("Trip 1 took "+ secOne/secPerMin+ " minutes and had "+cycOne+" counts.");
        System.out.println("Trip 2 took " + secTwo/secPerMin+ " minutes and had "+cycTwo+" counts.");
        System.out.println("Trip 1 was "+disTrip1+" miles.");
        System.out.println("Trip 2 was "+disTrip2+" miles.");
        System.out.println("The total distance was "+totDis+" miles.");
    }
}