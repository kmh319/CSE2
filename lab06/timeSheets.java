//Calculate the earnings of various employees
//
//@author Kaitlyn Hennessy
//@version 10/2/15

import java.util.Scanner;
public class timeSheets{
    public static void main(String[] args){
        int employeeTot=0; //Sum of all earnings
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of employees: ");
        int numEmployees=scan.nextInt(); //Take the number of employees
            while (numEmployees<=0){ //Verify there are employees
                System.out.println("Number of employees must be a positive integer.\n Enter number of employees: ");
                numEmployees=scan.nextInt(); //Let user enter a new value
            }
            for(int x=1;x<=numEmployees;x++){ //
                int employeePay=0;//Reset employeePay to 0 for each employee
                System.out.println("--Employee "+x+"--");
                System.out.println("Pay rate per hour (in cents xx): ");
                int payRate=scan.nextInt(); //save payRate
                while(payRate<=0){ //Make sure they are earning money
                    System.out.println("Pay rate must be a positive integer.\nPay rate per hours (in cents): ");
                    payRate=scan.nextInt(); //Let user enter a new value
                }    
                System.out.println("Hours worked per day: ");
                for(int y=1;y<=5;y++){ //Run through the week
                    String weekday="";
                    int hoursWorked=0; //reset hoursWorked to 0 for each employee
                        switch(y){ //get the String of the weekday
                            case 1:
                                weekday="Monday";
                                break;
                            case 2:
                                weekday="Tuesday";
                                break;
                            case 3: 
                                weekday="Wednesday";
                                break;
                            case 4: 
                                weekday="Thursday";
                                break;
                            case 5: 
                                weekday="Friday";
                        }
                    System.out.println(weekday+": ");
                    hoursWorked=scan.nextInt(); //Get hoursWorked
                        while(hoursWorked<0){//Make sure they didn't work a negative value.
                            System.out.println("Hours worked must be a positive integer.\n"+weekday+": ");
                            hoursWorked=scan.nextInt(); //Save hoursWorked
                        }
                    employeePay+=(hoursWorked*payRate); //update the employee's earnings
                }
                System.out.println("Employee "+x+" earnings: "+employeePay+" cents."); //Print individual employee's earnings
                employeeTot+=employeePay; //update total
            }
            System.out.println("Sum of all earnings: "+employeeTot+" cents.");
        }
}
        
