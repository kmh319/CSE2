//Print a pyramid based on user-entered height.
//
//@author Kaitlyn Hennessy
//@version 10/2/15
//
import java.util.Scanner;
public class pyramid{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in); //Scanner object
        int pyramidSize=0; //Initialize pyramidSize variable
        int stars=1; //Initialize number of stars per row.
        System.out.println("What size pyramid?");
        pyramidSize=scan.nextInt(); //Save pyramidSize
        while(pyramidSize<=0){ //Check entry validity
            System.out.println("Pyramid size must be greater than or equal to 0.\nWhat size pyramid?");
            pyramidSize=scan.nextInt(); //Take new submission
        }
        for(int x=1;x<=pyramidSize;x++){ //Create each row
            if(x!=1){ //Add stars if not the first row.
                stars+=2;
            }
            for(int i=pyramidSize-1;i>=x;i--){//Print appropriate number of spaces before stars.
                System.out.print(" ");
            }
            for(int z=0;z<stars;z++){ //Print appropriate number of stars.
                System.out.print("*");
            }
            System.out.println(); //Move to the next line.
        }
    }
}
