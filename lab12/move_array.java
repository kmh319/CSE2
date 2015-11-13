//Create an array of user-determined size, fill with random values, and have the user select an index to be moved to the end.  Move effected values to the right one position.
//@author Kaitlyn Hennessy
//@version 11/13/15
import java.util.Scanner;//Import Scanner class
public class move_array{//Create class move_array
    public static void main (String[] args){//Create main method
        Scanner scan=new Scanner (System.in);//Create Scanner object
        System.out.println("Enter the size of the array: ");//Prompt user for array size
        int arrSize=scan.nextInt();//Save the size to arrSize
        while(arrSize<=0){//Check validity of arrSize
            System.out.println("Array size must be greater than 0.\nEnter the size of the array: ");//Tell user to enter new value
            arrSize=scan.nextInt();//Save new value for checking
        }
        int[] array=new int[arrSize];//Create the array using the user-determined size
        for(int a=0;a<array.length;a++){//Move through the array index
            array[a]=(int)(Math.random()*100);//Fill the index with a random number between 0 and 100
            System.out.println("array["+a+"]: "+array[a]);//Print the value
        }
        int index=indexCheck(array);//Call index check and pass the array, save the result to index
        int temp=array[index];//Save the value at the last position to a temporary value
        for(int b=index;b < array.length - 1; b++){//Run through the array indexes that need updating
            array[b]=array[b+1];//Move arrayp[b] to the next index
        }
        array[arrSize - 1] = temp;//Set the value from the user-selected index to the last index of the array
        for(int c=0;c<array.length;c++){//Run through the array
            System.out.println("array["+c+"]: "+array[c]);//Print the value at array[c]
        }
    }
    public static int indexCheck(int [] array){//Method to check the user-picked index in a try-catch
        Scanner scan=new Scanner(System.in);//Create Scanner object
        System.out.println("Enter index to be moved: ");//Prompt user to input an index selection
        int index=scan.nextInt();//Save the user's pick to index
        try{
            int value=array[index];//Check that the index exists in the array
        }
        catch(Exception e){//Catch the error if the index is invalid
            System.out.println("Invalid index.");//Tell the user the index is invalid
            indexCheck(array);//Recursive call, get new index selection
        }
        return index;//Return the user-selected value to the main method
    }
}