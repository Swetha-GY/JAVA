
// Finding The given number is Even or Odd

import java.util.Scanner;

public class Number1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number :");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("The Given Number is Even Number");
        } else {
            System.out.println("The Given Number is Odd Number");

        }
        sc.close();
    }
}