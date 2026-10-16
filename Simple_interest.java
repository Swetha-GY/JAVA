
// Program to Calculate Simple Interest

import java.util.Scanner;

public class Simple_interest {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principal Amount :");
        double p = sc.nextDouble();
        System.out.print("Enter the Rate of Interest :");
        double r = sc.nextDouble();
        System.out.print("Enter the Time taken :");
        double t = sc.nextDouble();

        double SI = p * t * r / 100;

        System.out.print("Simple Interest =" + SI);

        sc.close();
    }
}
