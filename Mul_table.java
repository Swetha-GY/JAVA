
// Program to Print Multiplication Table

import java.util.Scanner;

public class Mul_table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number to print Multiplication Table :");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + "X" + i + "=" + (n * i));
        }
        sc.close();
    }
}
