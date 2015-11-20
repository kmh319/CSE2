//A class that calculates the area of a rectangle with global variables and nonstatic methods.
//@author Kaitlyn Hennessy
//@version 11/20/15

public class Rectangle{//Create the class Rectangle
    double width=0.00;//Create global variable width and initialize it with value 0.00
    double height=0.00;//Create global variable height and initialize it with value 0.00
    
    public static void main(String[] args){//Main method
        Rectangle r1=new Rectangle();//Create an object, r1, for the class Rectangle
        r1.setWidth(7.3);//Use the object r1 to call setWidth with the value 7.3
        r1.setHeight(5.3);//Use the object r1 to call setHeight with the value 5.3
        System.out.println("Width: "+r1.width+" u\nHeight: "+r1.height+" u\nArea: "+r1.getArea()+" u^2");//Print the area and the width and height used to calculate it
    }
    
    public void setWidth(double w){//Method to set the width of the rectangle with the parameter w
        width=w;//Set width equal to w
    }
    
    public void setHeight(double h){//Method to set the height of the rectangle with parameter h
        height=h;//Set height equal to h
    }
    
    public double getArea(){//Method to calculate and return the area of the rectangle
        return width*height;//Multiply width and height and return the value
    }
}