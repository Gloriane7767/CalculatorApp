package com.gloriane;

import java.util.InputMismatchException;
import java.util.Scanner;

//
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {// This starts a loop
            try {
                System.out.println("Enter an operator (+, -, *, /): ");
                char operator = scanner.next().charAt(0);

                double result = 0;

                switch (operator) {
                    case '+':
                        System.out.println("How many numbers do you want to add?");
                        int addCount = scanner.nextInt();
                        System.out.println("Enter numbers to add:");
                        for (int i = 0; i < addCount; i++) {
                            result += scanner.nextDouble();
                        }
                        break;

                    case '-':
                        System.out.println("How many numbers do you want to subtract?");
                        int subCount = scanner.nextInt();
                        System.out.println("Enter numbers to subtract:");
                        result = scanner.nextDouble(); // first number
                        for (int i = 1; i < subCount; i++) {
                            result -= scanner.nextDouble();
                        }
                        break;

                    case '*':
                        System.out.println("Enter first number: ");
                        double num1 = scanner.nextDouble();
                        System.out.println("Enter second number: ");
                        double num2 = scanner.nextDouble();
                        result = num1 * num2;
                        break;

                    case '/':
                        System.out.println("Enter first number: ");
                        double dividend = scanner.nextDouble();
                        System.out.println("Enter second number: ");
                        double divisor = scanner.nextDouble();
                        if (divisor != 0) {
                            result = dividend / divisor;
                        } else {
                            System.out.println("Error: Division by zero is not allowed.");
                            continue;
                        }
                        break;
                    default:
                        System.out.println("Invalid operator. Please try again.");
                        continue;
                }
                // Display result
                System.out.println("Result: " + result);

                // Ask if the user wants to continue
                System.out.println("Do you want to perform another calculation? (yes/no)");
                String choice = scanner.next().toLowerCase();

                if (choice.equals("no")) {// If the user typed "yes", the loop repeats.
                    break;    //Exits the loop immediately.
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter numbers only.");
                scanner.nextLine(); // clear bad input
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
                scanner.nextLine();
            }
        }
        scanner.close();// Close the scanner to free resources.
        System.out.println("Calculator closed");// Print a message when exiting.
    }
}

