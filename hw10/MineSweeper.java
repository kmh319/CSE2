//Generate a minesweeper board with user determined dimensions and number of mines.
//@author Kaitlyn Hennessy
//@version 11/8/15
import java.util.Scanner;//Import Scanner class
    public class MineSweeper{//Create MineSweeper class
        public static void main(String[] args){//Main method
            try{//Attempt to run code
                Scanner scan=new Scanner(System.in);//Create Scanner object
                System.out.println("Enter board dimensions (2-30): ");//Prompt user for board dimensions
                int boardD=scan.nextInt();//Save board dimension to boardD
                while((boardD<2)||(boardD>30)){//Check validity of user's input
                    System.out.println("Dimensions must be between 2 and 30.\nEnter board dimensions (2-30): ");//Prompt user for new dimensions
                    boardD=scan.nextInt();//Save new dimension to boardD
                }
                char [][]minesweeper=new char [boardD][boardD];//Create a 2D array minesweeper
                System.out.println("Enter number of mines (1-"+boardD*boardD+"): ");//Prompt user for number of mines to be input
                int mines=scan.nextInt();//Save number of mines to mines
                while ((mines<1)||(mines>(boardD*boardD))){//Check validity of entry
                    System.out.println("Number of mines must be between 1 and "+boardD*boardD+".\nEnter number of mines (1-"+boardD*boardD+"): ");//Prompt user for new number of mines
                    mines=scan.nextInt();//Save new number of mines
                }
                for(int a=0;a<minesweeper.length;a++){//For-loop for 1st dimension of the array
                    for(int b=0;b<minesweeper[a].length;b++){//For-loop or 2nd dimension of the array
                        minesweeper[a][b]='0';//Fill the position with '0'
                    }
                }
                while(mines>0){//Keep running the following code until all mines are placed
                    int x=(int)(Math.random()*boardD);//Generate random value for first dimension of the array
                    int y=(int)(Math.random()*boardD);//Generate random value for second dimension of the array
                    if(minesweeper[x][y]!='M'){//Check if there is already a mine at the position
                        minesweeper[x][y]='M';//Place a mine at the position
                            for (int c=x-1;c<=x+1;c++){//Get x values for spots surrounding the mine
                                for(int d=y-1;d<=y+1;d++){//Get y values for spots surrounding the mine
                                    try{//Attempt to update values around the mine
                                        if (minesweeper[c][d]=='0'){//If current value is 0
                                            minesweeper[c][d]='1';//Change to 1
                                        }
                                        else if(minesweeper[c][d]=='1'){//If current value is 1
                                           minesweeper[c][d]='2';//Change to 2
                                        }
                                        else if(minesweeper[c][d]=='2'){//If current value is 2
                                           minesweeper[c][d]='3';//Change to 3
                                        }
                                        else if(minesweeper[c][d]=='3'){//If current value is 3
                                            minesweeper[c][d]='4';//Change to 4
                                        }
                                        else if(minesweeper[c][d]=='4'){//If current value is 4
                                            minesweeper[c][d]='5';//Change to 5
                                        }
                                }
                                catch(Exception e){//Catch if the space next to the mine is out of the array bounds
                                }
                            }
                        }
                    }
                    mines--;//Decrease number of mines by 1
                }
                for(int i=0;i<(minesweeper.length);i++){//Run through columns of the array
                    for(int j=0;j<minesweeper[i].length;j++){//Run through rows of the array
                        System.out.print(minesweeper[i][j]+"\t");//Print the item at position [i][j]
                    }
                System.out.println();//Start new column
                }
            }
            catch(Exception e){//Catch if there is an invalid entry at some point
                System.out.println("Something has gone wrong.  Please run the program again.");//Alert the user that the program will end
                System.exit(0);//Quit the program
            }
        }
    }
