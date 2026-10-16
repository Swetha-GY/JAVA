
// Program to Convert Int to Double and Double to Int 
import java.util.Scanner;

public class Typecasting {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Integer :");
        int a = sc.nextInt();
        System.out.print("Enter the Double :");
        double b = sc.nextDouble();

        double x = a;
        int y = (int) b;

        System.out.println("Conversion from Integer to Double =" + x);
        System.out.println("Conversion from Double to Integer =" + y);

        sc.close();
    }
}
