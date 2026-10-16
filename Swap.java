// Program to swap numbers without using 3rd variable

import java.util.Scanner;

public class Swap {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter the 2 Numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.print("After swapping the numbers are :" + a + "," + b);

        sc.close();

    }

}
