import java.util.Scanner;
public class Test{
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("What is your monthly rent cost?");
    int rent = in.nextInt();
	if ((rent<600)||(rent>1200)){
        System.out.println("Unusual rent you have there.");
    }
}
}