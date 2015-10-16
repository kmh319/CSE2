//A program to calcultae the mean and median of a user determined set of numbers.
//
//@author Kaitlyn Hennessy
//@version 10/16/15

import java.util.Scanner; //Import Scanner class.
public class method{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in); //Create Scanner object.
        System.out.println("How many numbers will be entered?");
        int upperBound=scan.nextInt(); //Save the number of numbers to be collected.
        
        while(upperBound<=0){ //Check validity of number entered.
            System.out.println("Please enter a positive integer.");
            upperBound=scan.nextInt(); //Save new number to test again.
        }
        double[] allVals=new double[upperBound]; //Create an empty array to hold all the numbers.
        
        for(int x=0;x<upperBound;x++){ //for loop to fill the array.
            System.out.println("Number "+(x+1)+": ");
            allVals[x]=scan.nextDouble(); //Fill the array at position x with the user given number.
        }
        double mean=mean(upperBound, allVals); //Call mean() and save the returned value.
        double median=median(upperBound, allVals); //Call median() and save the returned value.
        printResult(mean, median); //Call printResult()
    }
    
    public static double mean(int upperBound, double[] allVals){//Method for calculating the mean.
        double total=0; //Create a variable for the total of all values.
        for(int x=0;x<upperBound;x++){ //For loop to cycle through all values.
            total+=allVals[x]; //Add the value at allVals[x] to the total
        }
        double mean=total/upperBound; //Calculate the mean
        return mean; //Return the mean to the main method.
    }
    
    public static double median(int upperBound, double[] allVals){//Method for calculating the median.
        double median=0; //Create a variable for the median.
        
        if (upperBound%2==0){ //Check if there are an even or odd number of values.
            int val1=(upperBound-1)/2;//Variable to hold the first of two middle values.
            int val2=((upperBound-1)/2)+1;//Variable to hold the second of two middle values.
            median=(allVals[val1]+allVals[val2])/2; //Calculate the median for an even number of values.
        }
        else{
            median=allVals[(upperBound)/2]; //Calculate the median for an odd number of values.
        }
        return median; //Return the median to the main method.
    }
    
    public static void printResult(double mean, double median){//Method to print the results.
        System.out.println("Mean: "+mean+"\nMedian: "+median);
    }
}