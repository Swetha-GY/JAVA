
// Program for Simple Calculator (Taking input from the user) 
import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter the Operator (+,-,*,/): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter the Second Number: ");
        double num2 = sc.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println(" Number can not be divided by Zero ");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }
        sc.close();

    }
}
