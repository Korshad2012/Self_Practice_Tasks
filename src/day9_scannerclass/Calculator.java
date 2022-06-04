package day9_scannerclass;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");

        double num1 = input.nextDouble();

        System.out.println("Enter a math operator: ");


        char ch = input.next().charAt(0);

        if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

            System.out.println("Enter the second number: ");
            double num2 = input.nextDouble();

            switch (ch) {

                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    System.out.println(num1 / num2);

            }

        } else {
            System.out.println("Invalid operator");
        }

        input.close();


    }
}
/*
9. Create a class named Claculator:
		- Ask the user to enter the first number (double)
		- Ask user to enter a math operator (char)
		- Ask user to enter the second number

		- print the calculation result,
		- if the operator is not a vliad math operator (+, -, *, /), then print "Invalid entry"
 */