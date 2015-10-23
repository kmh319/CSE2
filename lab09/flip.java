//A program to simulate a coin flip.  Can be run once or for a user-determined number of times.
//
//@author Kaitlyn Hennessy
//@version 10/22/2015
//
import java.util.Scanner;//Import scanner
public class flip{
        public static void main(String[] args){
            Scanner scan=new Scanner(System.in);//Create scanner object
            int[] results=new int[2];//Create an array to hold the results of the coin flip.
            System.out.println("~~~Coin Flip~~~");
            System.out.println("If you would like to do one run, enter 0.\nOtherwise, enter a number between 1 and 100.\nEnter something greater than 100 to quit.");
            int runs=scan.nextInt();//Save the requested number of runs.
                if(runs>0){//Check if user wants to flip more than once.
                    while(runs<101){//Ensure the user wants to continue.
                        System.out.println("How many flips?");
                        int flips=scan.nextInt();//Save the number of flips requested.
                        results=flip(flips);//Call flip(int n) and save the results to the array.
                        System.out.println("Heads: "+results[0]+"\nTails: "+results[1]); //Print the results of the flip.
                        System.out.println("Enter a number between 1 and 100 to continue.\nEnter a number greater than 100 to quit.");
                        runs=scan.nextInt();//Save the user's response.
                            while (runs<1){//Check for validity of response.
                                System.out.println("Invalid entry.\nEnter a number between 1 and 100 to continue.");
                                runs=scan.nextInt();//Save new input
                            }
                    }
                    System.out.println("Bye!");//Indicate the program has ended.
                }
                else{
                    results=flip();//Call flip(), which will only flip one coin.
                    System.out.println("Heads: "+results[0]+"\nTails: "+results[1]);//Print the results.    
                }
        }
        
        public static int[] flip(){//Create a method that will return an array of integers.
            double flipResult=Math.round(Math.random());//Generate the number that will determine the result of the flip.
            int[] results=new int[2];//Create an array to hold the results.
                if(flipResult==1.00){//Determine whether the result was heads or tails.
                    results[0]=1;//Fill the heads position with 1.
                    results[1]=0;//Fill the tails position with 0.
                }
                else{
                    results[0]=0;//Fill the heads position with 0.
                    results[1]=1;//Fill the tails position with 1.
                }
            return results; //Return the array of results.
        }
    
        public static int[] flip(int n){
            int heads=0;//Create a variable to hold the total number of heads.
            int tails=0;//Create an array to hold the total number of tails.
                while(n>0){//Terminate loop after the desired number of flips.
                    int[] result=flip();//Create an array and save the results of flip() to it.
                    n--;//Decrement n by 1
                        if(result[0]==1){//Determine the result of the flip based on the array.
                            heads++;//Increment heads by 1.
                        }
                        else{
                            tails++;//Increment tails by 1.
                        }
                }
            int[] total=new int[2];//Create an array for the total of heads and tails.
            total[0]=heads;//Fill the heads position with the number of heads flipped.
            total[1]=tails;//Fill the tails position with the number of tails flipped.
            return total;//Return the totals to the main method.
            }
}