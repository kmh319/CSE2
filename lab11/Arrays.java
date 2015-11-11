//A method to sort and merge arrays.
//@author Kaitlyn Hennessy
//@version 11/6/15

public class Arrays{//Create the class
    public static void main (String[] args){//Main method
        int[] array1= new int[20];//Create an array of integers length 20
        for(int x=0;x<array1.length;x++){//Run through the array
            array1[x]=(int)(Math.random()*100);//Generate a random number between 0 and 100 and fill the value in array1[x]
            System.out.println("array1["+x+"]: "+array1[x]);//Print the position and value
        }
        System.out.println("~~");//Print a divider for easier viewing
        int[] array2= new int[10];//Create an array of integers length 10
        for(int y=0;y<array2.length;y++){//Run through the array
            array2[y]=(int)(Math.random()*100);//Generate a random number between 0 and 100 and fill the value in array2[y]
            System.out.println("array2["+y+"]: "+array2[y]);//Print the position and value
        }
        System.out.println("~~");//Print a divider for easier viewing
        sort(array1);//Call sort() and pass array1
        System.out.println("~~");
        sort(array2);
    }
    
    public static void sort(int[] arr){//Method to sort the values of the array
        int largestVal=0;//Initialize variable to hold the largest value
        int loc = 0;//Initialize variable to hold the location of the largest value in the array
        int count = arr.length-1;// TODO comment
        int temp=0; //Initialize variable to hold one of the array values during swapping
        for(int x=0;x<arr.length;x++){//Run through the loop
            largestVal=0;//Set largest value to 0
            for(int y=0;y<count;y++){//Run through the unsorted array
                if(arr[y]>largestVal || arr[y]==largestVal){//TODO comment
                    largestVal=arr[y];//Save arr1[y] as the largest value
                    loc = y;//Save the current location in the array to loc
                }
            }
            //Swap
            temp=arr[loc];//Save arr1[loc] to a temporary value
            arr[loc]=arr[count];//Save arr1[count] to the position arr1[loc]
            arr[count]=temp;//Save temp to arr1[count]
            count--;//Decrement count by 1
            //System.out.println("arraySort["+x+"]: "+arr1[x]);//Print the sorted array at position x
        }
        for (int a=0; a<arr.length;a++){
            System.out.println("arraySort["+a+"]: "+arr[a]);
        }
    }
}