
// Program to Print Sum of N numbers

import java.util.Scanner;

public class Natural_num {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number :");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.print("The Sum is = " + sum);
        sc.close();
    }
}
