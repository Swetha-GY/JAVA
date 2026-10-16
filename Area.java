
// Program to Calculate Area of Circle

import java.util.Scanner;

public class Area {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Radius :");
        int r = sc.nextInt();
        final double pi = 3.14;

        double area = pi * r * r;

        System.out.println("The Area of the Circle is :" + area);

        sc.close();
    }
}
