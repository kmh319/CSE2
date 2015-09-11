//A program to compute the volume and surface area of a block.
//
//@author Kaitlyn Hennessy
//@version 9/11/15

import java.util.Scanner;
public class Block{
    
    public static void receiveValues(){ //Method to receive values from the user.
    Scanner myScanner=new Scanner(System.in); //Create scanner object.
    System.out.print("Please provid the length of the block in the format x.x: "); //Prompt user to provide length.
    float length=myScanner.nextFloat(); //Save length.
    System.out.print("Please provid the width of the block in the format x.x: "); //Prompt user to provide width.
    float width=myScanner.nextFloat(); //Save width.
    System.out.println("Please provide the height of the block in the format x.x: "); //Prompt user to provide height.
    float height=myScanner.nextFloat(); //Save height.
    volume(length, width, height); //Call the method 'volume'.
    surfaceArea(length, width, height); //Call the method 'surfaceArea'.
    }
    
    public static void volume(float length, float width, float height){ //Method to calculate volume.
        float volume=length*width*height; //Calculate volume.
        System.out.println("The volume of the block of dimensions "+length+"x"+width+"x"+height+" is "+volume); //Print volume.
    }
    
    public static void surfaceArea(float length, float width, float height){ //Method to calculate surface area.
        float surfaceArea=(2*height*width)+(2*height*length)+(2*width*length); //Calculate surface area.
        System.out.println("The surface area of the block is "+surfaceArea); //Print surface area.
    }
    
    public static void main (String[] args){ //Main method.
        receiveValues(); //Call the method 'receiveValues'.
    }
}