import java.util.Scanner;
public class interest{
    public static void main (String[] args){
        Scanner keyboard=new Scanner (System.in);
        double balance=keyboard.nextDouble();
        double interest=keyboard.nextDouble();
            if(interest>=1){
            }
            else{
                interest++;
            }
        double tot=balance*interest;
        int totInt=(int)tot;
        System.out.println("Balance: $"+balance);
        System.out.println("Interest rate: "+interest);
        System.out.println("Final balance: $"+totInt);
        }
    }