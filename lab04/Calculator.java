//A program to perform the basic mathematic operations: +, -, *, and /.
//
//@author Kaitlyn Hennessy
//@version 9/18/15

import java.util.Scanner; //Import scanner.
public class Calculator{
    public static void main (String[] args){
        takeInput(); //Call takeInput.
    }
    public static void takeInput(){
        Scanner myScanner=new Scanner(System.in); //Create scanner object
        System.out.println("Please input your first number (Format: xx.xx):");
        double numOne=myScanner.nextDouble(); //Save the first number
        System.out.println("Please input your operation (+,-,*,or /): ");
        String operation=myScanner.next(); //Save the operator
        System.out.println("Please input your second number (Format: xx.xx): ");
        double numTwo=myScanner.nextDouble(); //Save the second number.
        compute(numOne,operation,numTwo); //Call compute and supply it with values.
    }
    public static void compute(double numOne, String operation, double numTwo){
         double finalValue; //Variable to save solutions to.
         switch (operation){
            case "+":
                finalValue=numOne+numTwo; //Add the two values.
                System.out.println(numOne+"+"+numTwo+"="+finalValue);
                break;
            case "-":
                finalValue=numOne-numTwo; //Subtract the two values.
                System.out.println(numOne+"-"+numTwo+"="+finalValue);
                break;
            case "*":
                finalValue=numOne*numTwo; //Multiply the two values.
                System.out.println(numOne+"*"+numTwo+"="+finalValue);
                break;
            case "/":
                finalValue=numOne/numTwo; //Divide the two values.
                System.out.println(numOne+"/"+numTwo+"="+finalValue);
                break;
            default:
                System.out.println("Please input a valid operator (+,-,*,/).");
        }
    }
}