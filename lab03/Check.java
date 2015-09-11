//A program to split the check at a restauraunt.
//
//@author Kaitlyn Hennessy
//@version 9/11/2015
//
import java.util.Scanner;
public class Check{
    public static void main (String[] args){
        //Preparing to take user input.
        Scanner myScanner=new Scanner(System.in);//Create a scanner object.
        System.out.print("Enter the original cost of the check in the form xx.xx: "); //Prompt user to provide check cost
        double checkCost=myScanner.nextDouble(); //Receive and save check cost
        System.out.print("Enter the percentage tip that you wish to pay as a whole number in the form xx: "); //Prompt user to provide tip percent
        double tipPercent=(myScanner.nextDouble())/100; //Receive,save, and format tip percent.
        System.out.print("Enter the number of people who went out to dinner: "); //Prompt user to provide the number of people splitting the check.
        int numPeople=myScanner.nextInt(); //Receive and save number of people splitting the check.
        //Computations
        double totalCost=checkCost*(1+tipPercent); //Calculate the total cost to be split.
        double costPerPerson=totalCost/numPeople; //Split the total cost by the number of people sharing the bill.
        int dollars=(int)costPerPerson; //Convert the double to receive a dollar value.
        int dimes=(int)(costPerPerson*10)%10; //Convert the double to receive a tenths place value.
        int pennies=(int)(costPerPerson*100)%10; //Convert the double to receive a hundreths place value.
        
        System.out.println("Each person owes $"+dollars+"."+dimes+pennies); 
            //Print the final total owed per person by combining the dollar, dime, and penny amounts computed above.
    }
}