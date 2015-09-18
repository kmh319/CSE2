import java.util.Scanner;
public class Numbers{

     public static void main (String[] args){

          Scanner myScanner=new Scanner(System.in);

          System.out.println("Please enter 3 numbers.");

          System.out.print("Number 1: ");

          int numOne= myScanner.nextInt();

          System.out.print("Number 2: ");

          int numTwo=myScanner.nextInt();

          System.out.print("Number 3: ");

          int numThree=myScanner.nextInt();

          int avgVal=(numOne+numTwo+numThree)/3;

          System.out.print("You entered "+numOne+", "+numTwo+", and "+numThree+".  The average of these numbers is "+avgVal+".");

     }

}