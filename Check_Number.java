
// Program to Identify Positive number, Negative number and Zero 

import java.util.Scanner;

public class Check_Number {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number :");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.print(num + " is a Positive Number");
        } else if (num < 0) {
            System.out.print(num + " is a Negative Number");
        } else {
            System.out.print("The Given Number is Zero");
        }
        sc.close();
    }
}
