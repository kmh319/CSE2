//A method to sort and merge arrays.
//@author Kaitlyn Hennessy
//@version 11/6/15

public class Arrays{//Create the class
    public static void main (String[] args){//Main method
        int[] array1= new int[20];//Create an array of integers length 20
        int[] array2= new int[10];//Create an array of integers length 10
        int[] array3=new int[30];//Create an array of integers length 30
        
        for(int x=0;x<array1.length;x++){//Run through the array
            array1[x]=(int)(Math.random()*100);//Generate a random number between 0 and 100 and fill the value in array1[x]
            array3[x]=array1[x];//Set the value of array1[x] to array3[x]
            System.out.println("array1["+x+"]: "+array1[x]);//Print the position and value
        }
        System.out.println("~~");//Print a divider for easier viewing
        
        for(int y=0;y<array2.length;y++){//Run through the array
            array2[y]=(int)(Math.random()*100);//Generate a random number between 0 and 100 and fill the value in array2[y]
            array3[y+20]=array2[y];//Set the value at array2[y] to the position 
            System.out.println("array2["+y+"]: "+array2[y]);//Print the position and value
        }
        System.out.println("~~");//Print a divider for easier viewing

        for(int z=0;z<array3.length;z++){//Run through the array
            System.out.println("array3["+z+"]: "+array3[z]);//Print the value array3[z]
        }
        System.out.println("~~~");//Print a divider for easier viewing
        
        sort(array1);//Call sort() and pass array1
        System.out.println("~~");//Print a divider for easier viewing
        
        sort(array2);//Call sort() and pass array2
        System.out.println("~~~");//Print a divider for easier viewing
        
        sort(array3);//Call sort() and pass array3
    }
    
    public static void sort(int[] arr){//Method to sort the values of the array
        for (int i=0;i<arr.length;i++){//Run through the array
            for (int j=i;(j>0)&&(arr[j]<arr[j-1]);j--){//Check if the value at arr[j] needs to be swapped with arr[j-1]
                int temp=arr[j];//Save arr[j] to a temporary variable
                arr[j]=arr[j-1];//Switch arr[j] with arr[j-1]
                arr[j-1]=temp;//Assign the temporary value to arr[j-1]
            }
        }
        for (int a=0; a<arr.length;a++){//Run through the array
            System.out.println("arraySort["+a+"]: "+arr[a]);//Print arr[a]
        }
    }
}