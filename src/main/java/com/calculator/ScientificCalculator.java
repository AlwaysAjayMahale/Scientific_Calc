package com.calculator;

import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double a, b;

        do {
            System.out.println("\n--- Scientific Calculator ---");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
            System.out.println("5. Power\n6. Square Root\n7. Logarithm\n8. Sin\n9. Cos\n10. Tan");
            System.out.println("0. Exit");
            System.out.print("Choose an operation: ");
            choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter two numbers: ");
                        a = scanner.nextDouble();
                        b = scanner.nextDouble();
                        System.out.println("Result = " + (a + b));
                        break;
                    case 2:
                        System.out.print("Enter two numbers: ");
                        a = scanner.nextDouble();
                        b = scanner.nextDouble();
                        System.out.println("Result = " + (a - b));
                        break;
                    case 3:
                        System.out.print("Enter two numbers: ");
                        a = scanner.nextDouble();
                        b = scanner.nextDouble();
                        System.out.println("Result = " + (a * b));
                        break;
                    case 4:
                        System.out.print("Enter two numbers: ");
                        a = scanner.nextDouble();
                        b = scanner.nextDouble();
                        if (b == 0)
                            System.out.println("Error: Division by zero");
                        else
                            System.out.println("Result = " + (a / b));
                        break;
                    case 5:
                        System.out.print("Enter base and exponent: ");
                        a = scanner.nextDouble();
                        b = scanner.nextDouble();
                        System.out.println("Result = " + Math.pow(a, b));
                        break;
                    case 6:
                        System.out.print("Enter a number: ");
                        a = scanner.nextDouble();
                        System.out.println("Result = " + Math.sqrt(a));
                        break;
                    case 7:
                        System.out.print("Enter a number: ");
                        a = scanner.nextDouble();
                        System.out.println("Result = " + Math.log(a));
                        break;
                    case 8:
                        System.out.print("Enter angle in degrees: ");
                        a = Math.toRadians(scanner.nextDouble());
                        System.out.println("Result = " + Math.sin(a));
                        break;
                    case 9:
                        System.out.print("Enter angle in degrees: ");
                        a = Math.toRadians(scanner.nextDouble());
                        System.out.println("Result = " + Math.cos(a));
                        break;
                    case 10:
                        System.out.print("Enter angle in degrees: ");
                        a = Math.toRadians(scanner.nextDouble());
                        System.out.println("Result = " + Math.tan(a));
                        break;
                    case 0:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice!");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                scanner.nextLine(); // clear input buffer
            }

        } while (choice != 0);

        scanner.close();
    }
}
