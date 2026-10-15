// Program to print Name (Taking input from the user)

import java.util.Scanner;

public class User {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the Name :");
    String name = sc.nextLine();

    System.out.println("Given Input :" + name);
  }
}