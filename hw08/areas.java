//A program that can calculate the area of a circle, rectangle, or trapezoid.
//
//@author Kaitlyn Hennessy
//@version 10/23/15

import java.util.Scanner;//Call the scanner class.
public class areas{
    public static void main(String[] args){
        double area=0;//Create a variable to save the area to.
        Scanner scan=new Scanner(System.in);//Create a scanner object
        System.out.println("Enter the shape to compute area for from the following list:\n\tCircle\tRectangle\tTrapezoid");
        String shapeType=scan.next();//Save user's shape selection

        if(shapeType.equalsIgnoreCase("Circle")){//Circle preparation
            System.out.println("Enter the radius (x.xx): ");
            double radius=scan.nextDouble();//Save the user's radius
            while(radius<=0){//Check radius validity
                System.out.println("Radius cannot be equal to or less than 0.\nEnter the radius (x.xx): ");
                radius=scan.nextDouble();//Take the new radius value
            }
        area=area(radius);//Call area(int r) and save the value.
        }
        
        else if(shapeType.equalsIgnoreCase("Rectangle")){///Rectangle preparation
            System.out.println("Enter the length (x.xx): ");
            double length=scan.nextDouble();//Save the user's length
            while(length<=0){//Check length's validity.
                System.out.println("Length cannot be equal to or less than 0.\nEnter the length (x.xx): ");
                length=scan.nextDouble();//Take the new length value
            }
            System.out.println("Enter the width (x.xx): ");
            double width=scan.nextDouble();//Save the user's width
            while(width<=0){//Check the width's validity.
                System.out.println("Width cannot be equal to or less than 0.\nEnter the width (x.xx): ");
                width=scan.nextDouble();//Take the new width value.
            }
            area=area(length,width);//Call area(int l, int h) and save the value
        }
        
        else if(shapeType.equalsIgnoreCase("Trapezoid")){//Trapezoid preparation
            System.out.println("Enter the height (x.xx): ");
            double height=scan.nextDouble();//Save the user's height
            while(height<=0){//Check the heigh's validity
                System.out.println("Height cannot be equal to or less than 0.\nEnter the height (x.xx): ");
                height=scan.nextDouble();//Take the new height
            }
            System.out.println("Enter the size of the first base (x.xx): ");
            double base1=scan.nextDouble();//Save the user's first base
            while(base1<=0){//Check base 1's validity
                System.out.println("Base one cannot be equal to or less than 0.\nEnter the size of the first base (x.xx): ");
                base1=scan.nextDouble();//Take the new base 1
            }
            System.out.println("Enter the size of the second base (x.xx): ");
            double base2=scan.nextDouble();//Save the user's second base
            while (base2<=0){//Check base 2's validity
                System.out.println("Base two cannot be equal to or less than 0.\nEnter the size of the second base (x.xx): ");
                base2=scan.nextDouble();//Take the new base 2 value.
            }
            area=area(height, base1, base2);//Call area(int h, intb1, int b2) and save the value
        }
        
        else{//Selected shape isn't recognized
            System.out.println("Invalid selection.  Please run the program again.");
            System.exit(-1);//Quit the program
        }
        System.out.println("Area: "+area+" u^2");//Print the area
    }
    
    public static double area(double r){//Calculate the area of a circle.
        double area=(3.14*Math.pow(r,2))/2;//Calculate the area
        return area;//Return the area
    }

    public static double area(double l, double w){//Calculate the area of a rectangle
        double area=l*w;//Calculate the area
        return area;//Return the area
    }
    
    public static double area(double h, double b1, double b2){//Calculate the area of a trapezoid
        double area=((b1+b2)/2)*h;//Calculate the area
        return area;//Return the area
    }
}