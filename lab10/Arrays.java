//A method to generate a user-determined number of values and perform various computations.
//
//@author Kaitlyn Hennessy
//@version 10/30/15

import java.util.Scanner;//Import Scanner class.
public class Arrays{
    public static void main (String[] args){//Create main method
        constructArray();//Call constructArray();
    }
    //Method to set the array's number of values.
    public static void constructArray(){
        Scanner scan=new Scanner(System.in);//Create Scanner object.
        System.out.println("How many numbers will you generate?");//Prompt user for int.
        int arraySize=scan.nextInt();//Save user entered int.
        while(arraySize<=0){//Check validity of int.
            System.out.println("You must generate more than 0 numbers.\nHow many numbers will you generate?");//Inform user the entry was invalid, ask for another.
            arraySize=scan.nextInt();//Save new user entered int.
        }
        fillArray(arraySize);//Call fillArray()
    }
    //Method to give each position of the array a random value.
    public static void fillArray(int aSize){
        int[] randomArray=new int [aSize];//Declare the array.
        for(int x=0;x<randomArray.length;x++){//Loop iterates through each position.
            randomArray[x]=(int)(Math.random()*100);//Generate a random number from 0-100, put it in randomArray[x].
            System.out.println("Number "+(x+1)+": "+randomArray[x]);//Tell the user the value.
        }
        doMath(randomArray);//Call doMath()
    }
    //Method to compute the sum and average of the array and compare the values against the average.
    public static void doMath(int[]randomArray){
        int sum=0;//Initialize the variable that will hold the sum.
        int avg=0;//Initialize the variable that will hold the average.
        for(int y=0;y<randomArray.length;y++){//Loop through the array.
            sum+=randomArray[y];//Increment the sum by the value in randomArray[y].
        }
        avg=sum/(randomArray.length);//Generate the average by dividing the sum by the array's length.
        System.out.println("Sum: "+sum+"\nAverage: "+avg);//Tell the user the sum and average.
        System.out.println("Values greater than or equal to "+avg+":");
        for(int z=0;z<randomArray.length;z++){//Loop through the array positions.
            if(randomArray[z]>=avg){//Check if value at randomArray[z] for if it is >=avg.
                System.out.print(randomArray[z]+"\t");//If it is, print the average
            }
        }
    }
}