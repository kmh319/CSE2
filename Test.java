import java.util.Scanner;
public class Test {
       public static void main(String[] args){
              Scanner scan = new Scanner (System.in); //Scanner object
              System.out.println("Enter a number.");
              double userNum=scan.nextDouble(); //Save initial value
              while (userNum%5!=0){ //Run until a multiple of 5 is entered
                     System.out.println("Enter another number: ");
                     userNum=scan.nextDouble(); //Take next number
              }
              System.out.println(userNum+" is a multiple of 5!"); //Print when multiple of 5 is entered, end run.
       }
}