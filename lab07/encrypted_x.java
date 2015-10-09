//****
//Hide an x within a user-determined square of stars.
//****
//@author Kaitlyn Hennessy
//@version 10/9/15
//****
import java.util.Scanner;//Import scanner class
public class encrypted_x{
    public static void main (String[]args){
        saveInput();//Call the method saveInput()
    }
    
    public static void saveInput(){
        Scanner scan=new Scanner(System.in);//Create Scanner object
        System.out.println("Enter an integer to define the length and width of the square (Minimum=3, Maximum=100): ");
        if(!scan.hasNextInt()){//Check to ensure an integer was given.
            System.out.println("Dimension must be an integer.\nPlease run the program to try again.");
            System.exit(-1);//Quit the program
        }
        int squareDimension=scan.nextInt();//Save the user-input number
        //While loop to test the validity of the input.

        if((squareDimension<3)||(squareDimension>100)){
            System.out.println("Minimum dimension: 3\nMaximum dimension:100\nPlease run the program again to retry.");
            System.exit(-1);//Quit the program.
        }
        hideX(squareDimension);//Call the method hideX()
    }
    
    public static void hideX(int squareDimension){
        //For loop to print the output.
        for(int x=0;x<squareDimension;x++){//Create the length of the square.
            for(int y=0;y<squareDimension;y++){//Create the width of the square and conceal the x.
                if((x==y)||(x==squareDimension-(y+1))){//Test if a star should be printed or not.
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}