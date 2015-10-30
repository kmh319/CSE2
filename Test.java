import java.util.Scanner;
public class Test {
     public static String multiply(int a, int b){
         String returnVal="";
         int runs=0;
         int total=0;
         while(a<=b){
             if(runs==0){
             returnVal+=a;
             runs++;
             a++;
             total+=a;
             }
             else{
                 returnVal+="*"+a;
                 a++;
                 total*=a;
             }
             
             
         }
         returnVal+="="+total;;
         return returnVal;
     }
     public static void main (String[] args){
         Scanner scan=new Scanner(System.in);
         System.out.println("Enter your first integer(must be greater than or equal to zero): ");
         int x=scan.nextInt();
         while(x<0){
             System.out.println("Invalid entry.\nEnter your first integer(must be greater than or equal to zero): ");
             x=scan.nextInt();
         }
         System.out.println("Enter your second integer(must be greater than or equal to zero): ");
         int y=scan.nextInt();
         while(y<0){
             System.out.println("Invalid entry.\nEnter your second integer(must be greater than or equal to zero): ");
             y=scan.nextInt();
         }
         System.out.println(multiply(x,y));
         
     }
}