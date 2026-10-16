// Program to Swap numbers using 3rd variable

import java.util.Scanner;

public class Swap1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number :");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number :");
        int b = sc.nextInt();

        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping the Numbers :" + a + "," + b);
        sc.close();
    }
}